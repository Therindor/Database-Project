package test01917;

import java.sql.SQLException;
import java.util.List;

import connector01917.Connector;
import daoimpl01917.MySQLRaavareDAO;
import daointerfaces01917.DALException;
import dto01917.RaavareDTO;

public class RaavareTest {
	
	public static void main(String[] args) {
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		
		MySQLRaavareDAO raavareDAO = new MySQLRaavareDAO();

		// Create råvare
		
		try { 
			System.out.println("Indsættelse af raavare med raavare_id: 8, raavare_navn: bacon og leverandør: Tulip");
			RaavareDTO newRaavare = new RaavareDTO (8,"bacon","Tulip");
			raavareDAO.createRaavare(newRaavare);
		} catch (DALException e) { System.out.println(e.getMessage()); }

		
		try { 
			System.out.println("Indsættelse af raavare med raavare_id: 9, raavare_navn: salami og leverandør: Coop");
			RaavareDTO secondRaavare= new RaavareDTO (9,"salami","Coop");
			raavareDAO.createRaavare(secondRaavare);
		} catch (DALException e) { System.out.println(e.getMessage()); }

		// Get råvare list
		try {
			System.out.println("GetRaavare for alle elementer: ");
			List<RaavareDTO> list = raavareDAO.getRaavareList();
			for (RaavareDTO element : list) {
				System.out.println(element);	
			}
			
		} catch (DALException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Opdatere råvare 8 med nyt raavare_navn kalkunbacon, og leverandør Rema 1000");
			RaavareDTO newRaavare= new RaavareDTO (8,"kalkunbacon","Rema 1000");
			raavareDAO.updateRaavare(newRaavare);
			newRaavare = raavareDAO.getRaavare(8);
			System.out.println(newRaavare.getRaavareId() + "\t" + newRaavare.getRaavareNavn()
					+ "\t" + newRaavare.getLeverandoer());
		} catch (DALException e) {
			e.printStackTrace();
		}
		
	}

}
