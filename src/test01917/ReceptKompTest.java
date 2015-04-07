package test01917;

import java.sql.SQLException;
import java.util.List;

import connector01917.Connector;
import daointerfaces01917.DALException;
import daointerfaces01917.ReceptKompDAO;
import daoimpl01917.MySQLReceptKompDAO;
import dto01917.ReceptKompDTO;
public class ReceptKompTest {
	
	private static final int receptID = 1;
	private static final int raavareID = 2;
	
	public static void main(String[] args){
		
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		
		ReceptKompDAO rcptKomp = new MySQLReceptKompDAO();
		try {
			System.out.println("recept med recept_id = 1, og raavare_id = 2 er: " + rcptKomp.getReceptKomp(1, 2));
		
			System.out.println("receptKomponent-liste med recept_id = 3 er: " + rcptKomp.getReceptKompList(3));
		
			System.out.println("receptkomponent-liste er: " + rcptKomp.getReceptKompList());
			rcptKomp.createReceptKomp(new ReceptKompDTO(4, 1, 3.0, 0.5));
			System.out.println("ny oprettet receptkomp er: " + rcptKomp.getReceptKomp(4, 2));
			rcptKomp.updateReceptKomp(new ReceptKompDTO(2, 1, 10.5, 2.5));
			System.out.println("opdateret receptkomp er: " + rcptKomp.getReceptKomp(2, 1));
		} catch (DALException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
