
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Gestion_BDD {

	public void verifVitrine(String nom_prod) {
		
	}
	
	public void supprimerStock(String nom, int quantite) {
		String url = "localhost";
		String login = "root";
		String password = "root";
		try{
			
			//Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,login,password);
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("DELETE * FROM Stocks WHERE ");
		}
		catch(SQLException sqle){
			System.out.print(sqle.getMessage());
		}
	}
	
	public void ajouterStock(String nom, int quantite) {
		
	}
}
