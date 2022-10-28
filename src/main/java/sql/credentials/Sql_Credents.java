package sql.credentials;

public class Sql_Credents {

	private static String sqlUser="root";
	private static String sqlPass="Vaffancul5@";
	private static String sqlUrlServ="jdbc:mysql://"+ "localhost:3306/traviuonlineshop?serverTimezone=UTC";
	
	public Sql_Credents() {};
	  
	public static String getSqlUser() {
		return sqlUser;
	}
	
	public static String getSqlPass() {
		return sqlPass;
	}
	  
	public static String getUrlSqlServ() {
		return sqlUrlServ;
	}

}
