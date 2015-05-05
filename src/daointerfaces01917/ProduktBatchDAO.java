package daointerfaces01917;

import java.util.List;

import dto01917.ProduktBatchDTO;

public interface ProduktBatchDAO {
	/**
	 * @param pbId Is the ID of the desired produktbatch.
	 * @return An object of type ProduktBatchDTO, that corresponds to the given ID.
	 * @throws DALException
	 */
	ProduktBatchDTO getProduktBatch(int pbId) throws DALException;
	/**
	 * @return A full List of the generic type ProduktBatchDTO.
	 * @throws DALException
	 */
	List<ProduktBatchDTO> getProduktBatchList() throws DALException;
	/**
	 * Inserts a new tuple in the table produktbatch, with values parsed from the produktbatch object of type ProduktBatchDto.
	 * @param produktbatch An object of ProduktBatchDTO.
	 * @throws DALException
	 * 
	 */
	void createProduktBatch(ProduktBatchDTO produktbatch) throws DALException;
	/**
	 * Updates a tuple in the produktbatch table with the values parsed from the produktbatch object of type ProduktBatchDTO.
	 * @param produktbatch An object of ProduktBatchDTO.
	 * @throws DALException
	 */
	void updateProduktBatch(ProduktBatchDTO produktbatch) throws DALException;
}