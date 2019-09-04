import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
			PreparedStatement st1=con.prepareStatement("delete from emp where eno=100");
			st1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
