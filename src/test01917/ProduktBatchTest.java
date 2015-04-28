package test01917;
import connector01917.Connector;
import daoimpl01917.MySQLProduktBatchDAO;

import java.sql.SQLException;

import daointerfaces01917.DALException;
import dto01917.ProduktBatchDTO;

public class ProduktBatchTest {
	
	public static void main(String []args){
		try { new Connector(); }
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		
		System.out.println("Produktbatch id: 3");
		MySQLProduktBatchDAO pbDAO = new MySQLProduktBatchDAO();
		try { System.out.println(pbDAO.getProduktBatch(3)); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Indsaettelse af ny produktbatch med pbId =  7");
		ProduktBatchDTO pbDTO = new ProduktBatchDTO(7,1,3);
		try { pbDAO.createProduktBatch(pbDTO); }
		catch (DALException e) { System.out.println(e.getMessage()); }	
		
		System.out.println("Produktbatch id: 4");
		try { System.out.println(pbDAO.getProduktBatch(4)); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		
		System.out.println("Opdatering af produktbatch");
		try { pbDAO.updateProduktBatch(new ProduktBatchDTO(3,2,2)); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Alle produktbatch:");
		try { System.out.println(pbDAO.getProduktBatchList()); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		
	}

}

// id, status, recieptId