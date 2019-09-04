import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
			PreparedStatement st1=con.prepareStatement("insert into emp(eno,eName,salary) values(100,'AAA',10000)");
			st1.executeUpdate();
			PreparedStatement st2=con.prepareStatement("insert into emp(eno,eName,salary) values(101,'BBB',20000)");
			st2.executeUpdate();
			con.close();
			System.out.println("Data Inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
