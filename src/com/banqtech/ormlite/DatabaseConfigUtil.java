package com.banqtech.ormlite;

import java.io.IOException;
import java.sql.SQLException;

import com.banqtech.ormlite.entity.People;
import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

public class DatabaseConfigUtil extends OrmLiteConfigUtil {
	
	private static final Class<?>[] classes = new Class[]{People.class};
	
	public static void main(String[] args) throws SQLException, IOException {
		writeConfigFile("ormlite_config",classes);
	}
}
