import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class CreateData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
			PreparedStatement st1=con.prepareStatement("create table db.emp(eno int,eName varchar(20),salary int)");
			st1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
