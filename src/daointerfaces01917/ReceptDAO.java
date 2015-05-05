package daointerfaces01917;

import java.util.List;

import dto01917.ReceptDTO;

public interface ReceptDAO {
	/**
	 * @param receptId Is the ID of the desired recept.
	 * @return An object of type ReceptDTO, that corresponds to the given ID.
	 * @throws DALException
	 */
	ReceptDTO getRecept(int receptId) throws DALException;
	/**
	 * @return A full List of the generic type ReceptDTO.
	 * @throws DALException
	 */
	List<ReceptDTO> getReceptList() throws DALException;
	/**
	 * Inserts a new tuple in the table recept, with values parsed from the recept object of type ReceptDTO.
	 * @param recept An object of ReceptDTO.
	 * @throws DALException
	 * 
	 */
	void createRecept(ReceptDTO recept) throws DALException;
	/**
	 * Updates a tuple in the recept table with the values parsed from the recept object of type ReceptDTO.
	 * @param recept An object of ReceptDTO.
	 * @throws DALException
	 */
	void updateRecept(ReceptDTO recept) throws DALException;
	/** Gets the last element of the recept table
	 * @return An object of type ReceptDTO.
	 * @throws DALException
	 */
	ReceptDTO getLatestRecept() throws DALException;
	}
