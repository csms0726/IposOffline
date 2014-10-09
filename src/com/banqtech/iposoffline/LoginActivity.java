package com.banqtech.iposoffline;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import com.banqtech.ormlite.DatabaseHelper;
import com.banqtech.ormlite.entity.People;
import com.banqtech.utils.StringUtils;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

public class LoginActivity extends ActionBarActivity {
	
	DatabaseHelper dbHelper;
	EditText etUserName;
	EditText etPassword;
	Button bLogin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign);
		doPeopleDataStuff();
		etUserName = (EditText) findViewById(R.id.etUserName);
		etPassword = (EditText) findViewById(R.id.etPassword);
		bLogin = (Button) findViewById(R.id.bLogin);
		
		bLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				/*Intent intent = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(intent);
				overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);*/
				loginUser(etPassword);
			}
		});
		etPassword.setOnEditorActionListener(new OnEditorActionListener() {
			
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				if (actionId == EditorInfo.IME_ACTION_DONE) {
					Intent intent = new Intent(getApplicationContext(), MainActivity.class);
					startActivity(intent);
					overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
		            //loginUser(v);
		            return true;  
		        }
				return false;
			}
		});
	}
	
	private void doPeopleDataStuff(){
		dbHelper = OpenHelperManager.getHelper(this, DatabaseHelper.class);
		RuntimeExceptionDao<People, String> peopleDao = dbHelper.getPeopleRuntimeExceptionDao();
		List<People> peoples = peopleDao.queryForAll();
		if( peoples.size()<=0 ){
			peopleDao.create(new People(UUID.randomUUID().toString(),"user 1",StringUtils.hashString("test1"), "card 1", null, true, null));
			peopleDao.create(new People(UUID.randomUUID().toString(),"user 2",StringUtils.hashString("test2"), "card 2", null, true, null));
			peopleDao.create(new People(UUID.randomUUID().toString(),"user 3",StringUtils.hashString("test3"), "card 3", null, true, null));
			peopleDao.create(new People(UUID.randomUUID().toString(),"user 4",StringUtils.hashString("test4"), "card 4", null, true, null));
		}
		OpenHelperManager.releaseHelper();
	}
	private boolean isPasswordValid(String password) {
		// TODO: Replace this with your own logic
		return password.length() >= 4;
	}
	
	private void loginUser(TextView v){
		
		etUserName.setError(null);
		etPassword.setError(null);
		String username = etUserName.getText().toString();
		String password = etPassword.getText().toString();
		boolean cancel = false;
		View focusView = null;

		if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
			etPassword.setError("Нууц үг богино байна.");
			focusView = etPassword;
			cancel = true;
		} else if(TextUtils.isEmpty(password)){
			etPassword.setError("Нууц үгээ оруулна уу.");
			focusView = etPassword;
			cancel = true;
		}
		
		if (TextUtils.isEmpty(username)) {
			etUserName.setError("Нэр оруулна уу");
			focusView = etUserName;
			cancel = true;
		} 
		
		if(cancel){
			focusView.requestFocus();
		} else {
			dbHelper = OpenHelperManager.getHelper(this, DatabaseHelper.class);
			RuntimeExceptionDao<People, String> peopleDao = dbHelper.getPeopleRuntimeExceptionDao();
			QueryBuilder<People, String> qbPeople = peopleDao.queryBuilder();
			try {
				if(v != null){
					InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
		            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
				}
				
				qbPeople.where().eq("name", etUserName.getText().toString()).and().eq("apppassword", StringUtils.hashString(etPassword.getText().toString()));
				PreparedQuery<People> pqPeople = qbPeople.prepare();
				List<People> people = peopleDao.query(pqPeople);
				if(people.size()>0){
					Intent intent = new Intent(this, MainActivity.class);
					startActivity(intent);
					overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
				} else {
					ShowMessageBox(this, "Нэр нууц үг тохирохгүй байна.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		OpenHelperManager.releaseHelper();
	}
	public static void ShowMessageBox(Context cont, String msg) {
        Toast toast = Toast.makeText(cont, msg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 50);
        toast.show();
    }
}
