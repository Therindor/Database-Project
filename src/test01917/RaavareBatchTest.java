package test01917;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connector01917.Connector;
import daointerfaces01917.DALException;
import dto01917.RaavareBatchDTO;
import daoimpl01917.MySQLRaavareBatchDAO;
import daoimpl01917.MySQLReceptDAO;

public class RaavareBatchTest {
	
	public static void main(String[] args) {
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		
		MySQLRaavareBatchDAO raavareBatchDAO = new MySQLRaavareBatchDAO();

		// Create råvare batch
		
		try { 
			System.out.println("Indsættelse af raavarebatch med rb_id: 45, raavare_id: 1 og mængde: 1000");
			RaavareBatchDTO newRaavareBatch = new RaavareBatchDTO (45,1,1000);
			raavareBatchDAO.createRaavareBatch(newRaavareBatch);
		} catch (DALException e) { System.out.println(e.getMessage()); }

		
		try { 
			System.out.println("Indsættelse af raavarebatch med rb_id: 43, raavare_id: 3 og mængde: 500");
			RaavareBatchDTO secondRaavareBatch = new RaavareBatchDTO (43,3,500);
			raavareBatchDAO.createRaavareBatch(secondRaavareBatch);
		} catch (DALException e) { System.out.println(e.getMessage()); }

		// Get råvare batch list
		try {
			System.out.println("GetRaavareBatch for alle elementer: ");
			List<RaavareBatchDTO> list = raavareBatchDAO.getRaavareBatchList();
			for (RaavareBatchDTO element : list) {
				System.out.println(element);	
			}
			
		} catch (DALException e) {
			e.printStackTrace();
		}
		
		// Get råvare batch list med bestemt raavare ID
		try {
			System.out.println("GetRaavareBatch for element med raavare_id 1:");
			List<RaavareBatchDTO> list = raavareBatchDAO.getRaavareBatchList(1);
			for (RaavareBatchDTO element : list) {
				System.out.println(element);	
			}
		} catch (DALException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Opdatere råvarebatch 45 med nyt raavare_id 5, og mængde 500");
			RaavareBatchDTO newRaavareBatch = new RaavareBatchDTO (45,5,500);
			raavareBatchDAO.updateRaavareBatch(newRaavareBatch);
			List<RaavareBatchDTO> list = raavareBatchDAO.getRaavareBatchList(5);
			for (RaavareBatchDTO element : list) {
				System.out.println(element);	
			}
		} catch (DALException e) {
			e.printStackTrace();
		}
		
	}

}
