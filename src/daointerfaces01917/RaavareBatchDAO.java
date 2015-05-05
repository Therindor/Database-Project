package daointerfaces01917;

import java.util.List;

import dto01917.RaavareBatchDTO;

public interface RaavareBatchDAO {
	/**
	 * @param rbId Is the ID of the desired raavarebatch.
	 * @return An object of type RaavareBatchDTO, that corresponds to the given ID.
	 * @throws DALException
	 */
	RaavareBatchDTO getRaavareBatch(int rbId) throws DALException;
	/**
	 * @return A full List of the generic type RaavareBatchDTO.
	 * @throws DALException
	 */
	List<RaavareBatchDTO> getRaavareBatchList() throws DALException;
	/**
	 * @param raavareId Is the raavarebatch ID of all the desired raavarebatches.
	 * @return A List of the generic type RaavareBatchDTO, with raavare ID.
	 * @throws DALException
	 */
	List<RaavareBatchDTO> getRaavareBatchList(int raavareId) throws DALException;
	/**
	 * Inserts a new tuple in the table raavarebatch, with values parsed from the raavarebatch object of type RaavareBatchDTO.
	 * @param raavarebatch An object of RaavareBatchDTO.
	 * @throws DALException
	 * 
	 */
	void createRaavareBatch(RaavareBatchDTO raavarebatch) throws DALException;
	/**
	 * Updates a tuple in the raavarebatch table with the values parsed from the ravaarebatch object of type RaavareBatchDTO.
	 * @param raavarebatch An object of RaavareBatchDTO.
	 * @throws DALException
	 */
	void updateRaavareBatch(RaavareBatchDTO raavarebatch) throws DALException;
}

