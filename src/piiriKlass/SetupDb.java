package piiriKlass;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.DbUtils;
import java.sql.*;

/**
 * Servlet implementation class SetupDb
 */
public class SetupDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		try {
			setupDb();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		response.getWriter().println("success!");
		
	}
	
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	private void setupDb() throws Exception {

		Connection conn = DriverManager
				.getConnection("jdbc:hsqldb:file:${user.home}/i377/Team04d/db;shutdown=true");

		Statement stmt = null;
		ResultSet rset = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("DROP SCHEMA PUBLIC CASCADE");	
			stmt.executeUpdate("CREATE TABLE RIIGI_ADMIN_YKSUSE_LIIK (" +
	   "riigi_admin_yksuse_lik_id INTEGER," +
	   "avaja                VARCHAR(32) NOT NULL," +
       "avatud               DATE NOT NULL," +
       "muutja               VARCHAR(32) NOT NULL," +
       "muudetud             DATE NOT NULL," +
       "sulgeja              VARCHAR(32)," +
       "suletud              DATE NOT NULL," +
       "kood                 VARCHAR(10) NOT NULL," +
       "nimetus              VARCHAR(100) NOT NULL," +
       "kommentaar           LONGVARCHAR," +
       "alates               DATE NOT NULL," +
       "kuni                 DATE NOT NULL," +
       "PRIMARY KEY (riigi_admin_yksuse_lik_id))");
			
		stmt.executeUpdate("CREATE UNIQUE INDEX XPKRIIGI_ADMIN_YKSUSE_LIIK ON RIIGI_ADMIN_YKSUSE_LIIK " +
				"(riigi_admin_yksuse_lik_id)");
		
		stmt.executeUpdate("INSERT INTO RIIGI_ADMIN_YKSUSE_LIIK VALUES (" +
				"1," +
				"'Margus Neider'," +
				"'2013-01-12'," +
				"'Margus Neider'," +
				"'2013-01-12'," +
				"null," +
				"'9999-12-31'," +
				"'mk'," +
				"'maakond'," +
				"null," +
				"'2013-01-12'," +
				"'9999-12-31')");
		
		stmt.executeUpdate("INSERT INTO RIIGI_ADMIN_YKSUSE_LIIK VALUES (" +
				"2," +
				"'Ivan Orav'," +
				"'2013-01-12'," +
				"'Margus Neider'," +
				"'2013-01-12'," +
				"null," +
				"'9999-12-31'," +
				"'ln'," +
				"'linn'," +
				"null," +
				"'2013-01-12'," +
				"'9999-12-31')");
		
		stmt.executeUpdate("CREATE TABLE RIIGI_ADMIN_YKSUS (" +
				"riigi_admin_yksus_ID INTEGER," +
				"avaja                VARCHAR(32) NOT NULL," +
				"avatud               DATE NOT NULL," +
				"muutja               VARCHAR(32) NOT NULL," +
				"muudetud             DATE NOT NULL," +
				"sulgeja              VARCHAR(32)," +
				"suletud              DATE NOT NULL," +
				"kood                 VARCHAR(20)," +
				"nimetus              VARCHAR(100)," +
				"kommentaar           LONGVARCHAR," +
				"alates               DATE NOT NULL," +
				"kuni                 DATE NOT NULL," +
				"riigi_admin_yksuse_lik_id INTEGER NOT NULL," +
				"PRIMARY KEY (riigi_admin_yksus_ID), " +
				"FOREIGN KEY (riigi_admin_yksuse_lik_id) REFERENCES RIIGI_ADMIN_YKSUSE_LIIK ON DELETE RESTRICT) ");
		
		stmt.executeUpdate("CREATE UNIQUE INDEX XPKRIIGI_ADMIN_YKSUS ON RIIGI_ADMIN_YKSUS (riigi_admin_yksus_ID)");
		
		stmt.executeUpdate("CREATE INDEX XIF5RIIGI_ADMIN_YKSUS ON RIIGI_ADMIN_YKSUS (riigi_admin_yksuse_lik_id)");
		
		stmt.executeUpdate("INSERT INTO RIIGI_ADMIN_YKSUS VALUES (" +
				"1," +
				"'Ivan Orav'," +
				"'2013-01-12'," +
				"'Margus Neider'," +
				"'2013-01-12'," +
				"null," +
				"'9999-12-31'," +
				"'tln'," +
				"'Tallinn'," +
				"null," +
				"'2013-01-12'," +
				"'9999-12-31'," +
				"2)");
		
		stmt.executeUpdate("CREATE TABLE ADMIN_ALLUVUS (" +
				"admin_alluvus_id     INTEGER," +
				"avaja                VARCHAR(32) NOT NULL," +
				"avatud               DATE NOT NULL," +
				"muutja               VARCHAR(32) NOT NULL," +
				"muudetud             DATE NOT NULL," +
				"sulgeja              VARCHAR(32)," +
				"suletud              DATE NOT NULL," +
				"alates               DATE NOT NULL," +
				"kuni                 DATE NOT NULL," +
				"kommentaar           CHAR(18)," +
				"ylemus_yksus_ID      INTEGER NOT NULL," +
				"alluv_yksus_ID       INTEGER NOT NULL," +
				"PRIMARY KEY (admin_alluvus_id)," +
				"FOREIGN KEY (alluv_yksus_ID) REFERENCES RIIGI_ADMIN_YKSUS ON DELETE RESTRICT," +
				"FOREIGN KEY (ylemus_yksus_ID) REFERENCES RIIGI_ADMIN_YKSUS ON DELETE RESTRICT)");
		
		stmt.executeUpdate("CREATE UNIQUE INDEX XPKADMIN_ALLUVUS ON ADMIN_ALLUVUS" +
				"(admin_alluvus_id)");
		
		stmt.executeUpdate("CREATE INDEX XIF4ADMIN_ALLUVUS ON ADMIN_ALLUVUS " +
				"(alluv_yksus_ID)");	
		
		stmt.executeUpdate("INSERT INTO ADMIN_ALLUVUS VALUES (" +
				"1," +
				"'Margus Neider'," +
				"'2013-01-12'," +
				"'Margus Neider'," +
				"'2013-01-12'," +
				"'Margus Neider'," +
				"'2013-01-12'," +
				"null," +
				"'9999-12-31'," +
				"'9999-12-31'," +
				"'9999-12-31'," +
				"null," +
				"'Kommentaare pole'" +
				"0," +
				"0)");
		
		
		stmt.executeUpdate("CREATE TABLE VOIMALIK_ALLUVUS (" +
					"voimalik_alluvus_id  INTEGER," +
					"avaja                VARCHAR(32) NOT NULL," +
					"avatud               DATE NOT NULL," +
					"muutja               VARCHAR(32) NOT NULL," +
					"muudetud             DATE NOT NULL," +
					"sulgeja              VARCHAR(32)," +
					"suletud              DATE NOT NULL," +
					"riigi_admin_yksuse_lik_id INTEGER NOT NULL," +
					"voimalik_alluv_liik_ID INTEGER NOT NULL," +
					"kommentaar           LONGVARCHAR," +
					"PRIMARY KEY (voimalik_alluvus_id), " +
					"FOREIGN KEY (voimalik_alluv_liik_ID)" +
					"REFERENCES RIIGI_ADMIN_YKSUSE_LIIK ON DELETE RESTRICT, " +
					"FOREIGN KEY (riigi_admin_yksuse_lik_id) REFERENCES RIIGI_ADMIN_YKSUSE_LIIK ON DELETE RESTRICT )");
			
		stmt.executeUpdate("CREATE UNIQUE INDEX XPKVOIMALIK_ALLUVUS ON VOIMALIK_ALLUVUS" +
					"(voimalik_alluvus_id)");
			
		stmt.executeUpdate("CREATE INDEX XIF6VOIMALIK_ALLUVUS ON VOIMALIK_ALLUVUS" +
					"(riigi_admin_yksuse_lik_id)");
			
		stmt.executeUpdate("CREATE INDEX XIF7VOIMALIK_ALLUVUS ON VOIMALIK_ALLUVUS" +
					"(voimalik_alluv_liik_ID)");
		
		
		stmt.executeUpdate("INSERT INTO VOIMALIK_ALLUVUS VALUES (" +
				"1," +
				"'Margus Neider'," +
				"'2013-01-12'," +
				"'Margus Neider'," +
				"'2013-01-12'," +
				"null," +
				"'9999-12-31'," +
				"'mk'," +
				"'maakond'," +
				"null," +
				"'2013-01-12'," +
				"'9999-12-31'," +
				"'Kommentaare pole'" +
				"0," +
				"0)");
		

			/**stmt.executeUpdate("INSERT INTO RIIGI_ADMIN_YKSUSE_LIIK VALUES (1, 'bear 1', 3)");
			*stmt.executeUpdate("INSERT INTO bear VALUES (2, 'bear 2', 4)");
			*stmt.executeUpdate("INSERT INTO bear VALUES (3, 'bear 3', 5)");
			*/
		
		} finally {
			DbUtils.closeQuietly(rset);
			DbUtils.closeQuietly(stmt);
			DbUtils.closeQuietly(conn);
		}

}
}
