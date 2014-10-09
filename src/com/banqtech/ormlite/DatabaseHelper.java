package com.banqtech.ormlite;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.banqtech.iposoffline.R;
import com.banqtech.ormlite.entity.People;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {
	private static final String DATABASE_NAME = "ipos.db";
	private static final int DATABASE_VERSION = 1;
	private DatabaseHelper dbHelper;
	
	private Dao<People, String> peopleDao = null;
	private RuntimeExceptionDao<People, String> peopleRuntimeDao = null;
	
	public DatabaseHelper(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
	}

	@Override
	public void onCreate(SQLiteDatabase database,
			ConnectionSource connectionSource) {
		try {
			TableUtils.createTable(connectionSource, People.class);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase database,
			ConnectionSource connectionSource, int oldVersion, int newVersion) {
		try {
			TableUtils.dropTable(connectionSource, People.class, true);
			onCreate(database, connectionSource);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Dao<People, String> getPeopleDao() throws SQLException {
		if(peopleDao == null){
			peopleDao = getDao(People.class);
		}
		return peopleDao;
	}
	
	public RuntimeExceptionDao<People, String> getPeopleRuntimeExceptionDao(){
		if(peopleRuntimeDao == null){
			peopleRuntimeDao = getRuntimeExceptionDao(People.class);
		}
		return peopleRuntimeDao;
	}
}
