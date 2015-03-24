import java.sql.*;
public class Kursister {
	public static void main (String[] args) throws Exception
	{
		//load driveren
		Class.forName("com.mysql.jdbc.Driver");
				//opret forbindelse til databasen "test"
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");

		//opret sætningsobjekt
		Statement s = con.createStatement();
		s.executeUpdate("DROP TABLE IF EXISTS kursister");
		//opret ny tabel "kursister" i databasen
		s.executeUpdate("CREATE TABLE kursister (kursistnr INTEGER,  "+
							"navn VARCHAR(30), emailadresse VARCHAR(20))");

		//indsæt rækker i tabellen "kursister"
		s.executeUpdate("INSERT INTO kursister VALUES (357, 'Henry Wood','henry@wood.gb')");
		s.executeUpdate("INSERT INTO kursister VALUES (215, 'Henry Purcell','henry@purcell.gb')");
		s.executeUpdate("INSERT INTO kursister VALUES (448, 'William Walton','william@walton.gb')");

		//hent information om alle kurister på skærmen
		ResultSet rs = s.executeQuery("SELECT * FROM kursister");

		//udskriv information om alle kursister på skærmen
		while (rs.next())
		{
			int kursistnr= rs.getInt("kursistnr");
			String navn= rs.getString("navn");
			String emailadresse= rs.getString("emailadresse");

			System.out.println(kursistnr + " " + navn + " " + emailadresse);
		}

		//luk forbindelsen
		con.close();
	}
}   //// Uffe Kofod, d. 26.1.2007  - Finn Gustafsson - revision:  09.03.2015
