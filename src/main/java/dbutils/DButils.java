package dbutils;

import java.sql.Connection;
import java.sql.DriverManager;

import sql.credentials.Sql_Credents;

public class DButils {
	public static Connection getConnection() throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection(Sql_Credents.getUrlSqlServ(),Sql_Credents.getSqlUser(),Sql_Credents.getSqlPass());
 
	return conn;
} 
}
 