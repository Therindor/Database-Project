package daointerfaces01917;

import java.util.List;

import dto01917.RaavareDTO;

public interface RaavareDAO {
	/**
	 * @param raavareId Is the ID of the desired raavare.
	 * @return An object of type RaavareDTO, that corresponds to the given ID.
	 * @throws DALException
	 */
	RaavareDTO getRaavare(int raavareId) throws DALException;
	/**
	 * @return A full List of the generic type RaavareDTO.
	 * @throws DALException
	 */
	List<RaavareDTO> getRaavareList() throws DALException;
	/**
	 * Inserts a new tuple in the table raavare, with values parsed from the raavare object of type RaavareDTO.
	 * @param raavare An object of RaavareDTO.
	 * @throws DALException
	 * 
	 */
	void createRaavare(RaavareDTO raavare) throws DALException;
	/**
	 * Updates a tuple in the raavare table with the values parsed from the raavare object of type RaavareDTO.
	 * @param raavare An object of RaavareDTO.
	 * @throws DALException
	 */
	void updateRaavare(RaavareDTO raavare) throws DALException;
}
