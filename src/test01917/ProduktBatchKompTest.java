package test01917;

import java.sql.SQLException;

import connector01917.Connector;
import daoimpl01917.MySQLProduktBatchKompDAO;
import daointerfaces01917.DALException;
import dto01917.ProduktBatchKompDTO;

public class ProduktBatchKompTest {

	public static void main(String[] args) {
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		
		System.out.println("Produktbatch nummer pb_id = 1 og rb_id = 1:");
		MySQLProduktBatchKompDAO pbKompDAO = new MySQLProduktBatchKompDAO();
		try { System.out.println(pbKompDAO.getProduktBatchKomp(1,1)); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		
		System.out.println("Produktbatch nummer med pb_id 2 og rb_id =1 ");
		try { System.out.println(pbKompDAO.getProduktBatchKomp(2,1)); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("ProduktbatchKomp list ");
		try { System.out.println(pbKompDAO.getProduktBatchKompList()); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		ProduktBatchKompDTO pbKompDTO = new ProduktBatchKompDTO(1,5,0.9,3.2,2);
		
		System.out.println("ProduktbatchKomp indsættelse med pbId 1 rbId 5 tara 0.9 netto 3.2 og opr id 2 ");
		try { 
			pbKompDAO.createProduktBatchKomp(pbKompDTO);
			System.out.println(pbKompDAO.getProduktBatchKomp(1,5));}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		System.out.println("ProduktbatchKomp update pb 1 og rb 1 til netto 5");
		
		try { 
			ProduktBatchKompDTO tempDTO = pbKompDAO.getProduktBatchKomp(1,1);
			tempDTO.setNetto(5.00);
			pbKompDAO.updateProduktBatchKomp(tempDTO);
			System.out.println(pbKompDAO.getProduktBatchKomp(1, 1));}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
	}
	
		
	
	
	
}
