package cn.qbpan.dao;

import java.io.InputStream;
import java.util.Properties;


public class UserDao {
	
	private static  Properties dbConfig = new Properties();
	static {
		try {
			InputStream in = UserDao.class.getClassLoader().getResourceAsStream("db.properties");
			dbConfig.load(in);
			System.out.println(dbConfig.getProperty("url"));
		}
		catch(Exception e)
		{
			throw new ExceptionInInitializerError(e);
		}
			
	}
	
	public void  update() 
	{
		System.out.println(dbConfig.getProperty("url"));
	}
}
