package daointerfaces01917;

import java.util.List;

import dto01917.ReceptKompDTO;

public interface ReceptKompDAO {
	/**
	 * @param receptId Is the recept ID of the desired receptkomponent.
	 * @param raavareId Is the raavare ID of the desired receptkomponent.
	 * @return An object of type ReceptKompDTO, that corresponds to the given IDs.
	 * @throws DALException
	 */
	ReceptKompDTO getReceptKomp(int receptId, int raavareId) throws DALException;
	/**
	 * @param receptId Is the recept ID of all the desired receptkomponenter.
	 * @return A List of the generic type ReceptKompDTO, with recept ID.
	 * @throws DALException
	 */
	List<ReceptKompDTO> getReceptKompList(int receptId) throws DALException;
	/**
	 * @return A full List of the generic type ReceptKompDTO.
	 * @throws DALException
	 */
	List<ReceptKompDTO> getReceptKompList() throws DALException;
	/**
	 * Inserts a new tuple in the table receptkomponent, with values parsed from the receptkomponent object of type ReceptKompDTO.
	 * @param receptkomponent An object of ReceptKompDTO.
	 * @throws DALException
	 * 
	 */
	void createReceptKomp(ReceptKompDTO receptkomponent) throws DALException;
	/**
	 * Updates a tuple in the receptkomponent table with the values parsed from the receptkomponent object of type ReceptKompDTO.
	 * @param receptkomponent An object of ReceptKompDTO.
	 * @throws DALException
	 */
	void updateReceptKomp(ReceptKompDTO receptkomponent) throws DALException;
}
