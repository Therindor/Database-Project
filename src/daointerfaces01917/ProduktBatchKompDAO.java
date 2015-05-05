package daointerfaces01917;

import java.util.List;

import dto01917.ProduktBatchKompDTO;

public interface ProduktBatchKompDAO {
	/**
	 * @param pbId Is the produktbatch ID of the desired produktbatchkomponent.
	 * @param rbId Is the raavarebatch ID of the desired produktbatchkomponent.
	 * @return An object of type ProduktBatchKompDTO, that corresponds to the given IDs.
	 * @throws DALException
	 */
	ProduktBatchKompDTO getProduktBatchKomp(int pbId, int rbId) throws DALException;
	/**
	 * @param pbId Is the produktbatch ID of all the desired produktbatchkomponenter.
	 * @return A List of the generic type ProduktBatchKompDTO, with produktbatch ID.
	 * @throws DALException
	 */
	List<ProduktBatchKompDTO> getProduktBatchKompList(int pbId) throws DALException;
	/**
	 * @return A full List of the generic type ProduktBatchKompDTO.
	 * @throws DALException
	 */
	List<ProduktBatchKompDTO> getProduktBatchKompList() throws DALException;
	/**
	 * Inserts a new tuple in the table produktbatchkomponent, with values parsed from the produktbatchkomponent object of type ProduktBatchKompDTO.
	 * @param produktbatchkomponent An object of ProduktBatchKompDTO.
	 * @throws DALException
	 * 
	 */
	void createProduktBatchKomp(ProduktBatchKompDTO produktbatchkomponent) throws DALException;
	/**
	 * Updates a tuple in the produktbatchkomponent table with the values parsed from the produktbatchkomponent object of type ProduktBatchKompDTO.
	 * @param produktbatchkomponent An object of produktBatchKompDTO.
	 * @throws DALException
	 */
	void updateProduktBatchKomp(ProduktBatchKompDTO produktbatchkomponent) throws DALException;	
}

