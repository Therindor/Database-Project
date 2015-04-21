package test01917;

import java.sql.SQLException;

import connector01917.Connector;
import daoimpl01917.MySQLOperatoerDAO;
import daoimpl01917.MySQLReceptDAO;
import daointerfaces01917.DALException;
import dto01917.OperatoerDTO;
import dto01917.ReceptDTO;

public class ReceptTest {

	public static void main(String[] args) {
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		
		System.out.println("Recept nummer 1:");
		MySQLReceptDAO receptDAO = new MySQLReceptDAO();
		try { System.out.println(receptDAO.getRecept(1)); }
		catch (DALException e) { System.out.println(e.getMessage()); }

		
		System.out.println("Recept nummer 2:");
		try { System.out.println(receptDAO.getRecept(2)); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Recept nummer 3:");
		try { System.out.println(receptDAO.getRecept(3)); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("Indsættelse af Recept Fiskefrikedeller");
		ReceptDTO newRecept = new ReceptDTO(10,"Fiskefrikedeller");
		try { 
		
			receptDAO.createRecept(newRecept);
			newRecept = receptDAO.getLatestRecept();
			System.out.println(receptDAO.getRecept(newRecept.getReceptId()));
		}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		
		System.out.println("Opdater receptnavn på " + newRecept.getReceptId());
		newRecept.setReceptNavn("pizza");
		try { 
			receptDAO.updateRecept(newRecept);
			System.out.println(receptDAO.getRecept(newRecept.getReceptId()));
		}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		
		
	}
}
