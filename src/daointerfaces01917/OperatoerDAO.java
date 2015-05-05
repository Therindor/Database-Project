package daointerfaces01917;

import java.util.List;

import dto01917.OperatoerDTO;

public interface OperatoerDAO {
	/**
	 * @param oprId Is the ID of the desired operator.
	 * @return An object of type OperatoerDTO, that corresponds to the given ID.
	 * @throws DALException A userdefined Exception, that prints the exception that was caught.
	 */
	OperatoerDTO getOperatoer(int oprId) throws DALException;
	
	/**
	 * @return A full List of the generic type OperatoerDTO.
	 * @throws DALException A userdefined Exception, that prints the exception that was caught.
	 */
	List<OperatoerDTO> getOperatoerList() throws DALException;
	
	/**
	 * Inserts a new tuple in the table Operatoer, with values parsed from the opr object of type OperatoerDTO.
	 * @param opr An object of OperatoerDTO.
	 * @throws DALException A userdefined Exception, that prints the exception that was caught.
	 * 
	 */
	void createOperatoer(OperatoerDTO opr) throws DALException;
	
	/**
	 * Updates a tuple in the Operatoer table with the values parsed from the opr object of type OperatoerDTO.
	 * @param opr An object of OperatoerDTO.
	 * @throws DALException A userdefined Exception, that prints the exception that was caught.
	 */
	void updateOperatoer(OperatoerDTO opr) throws DALException;
}
