package daointerfaces01917;

import java.util.List;

import dto01917.OperatoerDTO;

public interface OperatoerDAO {
	/**
	 * @param oprId Is the ID of the desired operator.
	 * @return An object of type OperatoerDTO, that corresponds to the given ID.
	 * @throws DALException
	 */
	OperatoerDTO getOperatoer(int oprId) throws DALException;
	
	/**
	 * @return A full List of the generic type OperatoerDTO.
	 * @throws DALException
	 */
	List<OperatoerDTO> getOperatoerList() throws DALException;
	
	/**
	 * Inserts a new tuple in the table operatoer, with values parsed from the opr object of type OperatoerDTO.
	 * @param opr An object of OperatoerDTO.
	 * @throws DALException
	 * 
	 */
	void createOperatoer(OperatoerDTO opr) throws DALException;
	
	/**
	 * Updates a tuple in the operatoer table with the values parsed from the opr object of type OperatoerDTO.
	 * @param opr An object of OperatoerDTO.
	 * @throws DALException
	 */
	void updateOperatoer(OperatoerDTO opr) throws DALException;
}
