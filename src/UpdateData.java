import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
			PreparedStatement st1=con.prepareStatement("Update emp set eName=?,salary=? where eno=?");
			st1.setString(1, "AAA");
			st1.setInt(2, 15000);
			st1.setInt(3, 100);
			st1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
