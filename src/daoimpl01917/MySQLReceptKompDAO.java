package daoimpl01917;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connector01917.Connector;
import daointerfaces01917.DALException;
import daointerfaces01917.ReceptKompDAO;
import dto01917.ReceptKompDTO;

public class MySQLReceptKompDAO implements ReceptKompDAO {

	@Override
	public ReceptKompDTO getReceptKomp(int receptId, int raavareId)
	throws DALException {
	ResultSet rs = Connector.doQuery("SELECT * FROM receptkomponent WHERE recept_id = " + receptId + " and raavare_id = " + raavareId);
    try {
    	if (!rs.first()) throw new DALException("RecemptKomp" + receptId + " findes ikke");
    	return new ReceptKompDTO (rs.getInt(receptId), rs.getInt(raavareId), rs.getDouble("nom_netto"), rs.getDouble("tolerance"));
    }
    catch (SQLException e) {throw new DALException(e); }
	}

	@Override
	public List<ReceptKompDTO> getReceptKompList(int receptId)
			throws DALException {
		List<ReceptKompDTO> list = new ArrayList<ReceptKompDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM receptkomponent");
		try
		{
			while (rs.next()) 
			{
				list.add(new ReceptKompDTO(rs.getInt(receptId), rs.getInt("raavare_Id"), rs.getDouble("nom_netto"), rs.getDouble("tolerance")));
			}
		}
		catch (SQLException e) { throw new DALException(e); }
		return list;
	}

	@Override
	public List<ReceptKompDTO> getReceptKompList() throws DALException {
		List<ReceptKompDTO> list = new ArrayList<ReceptKompDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM receptkomponent");
		try
		{
			while (rs.next()) 
			{
				list.add(new ReceptKompDTO(rs.getInt("recept_Id"), rs.getInt("raavare_Id"), rs.getDouble("nom_netto"), rs.getDouble("tolerance")));
			}
		}
		catch (SQLException e) { throw new DALException(e); }
		return list;
	}

	@Override
	public void createReceptKomp(ReceptKompDTO receptkomponent)
			throws DALException {
		Connector.doUpdate(
				"INSERT INTO receptkomponent (recept_id, raavare_id, nom_netto, tolerance) VALUES " +
				"(" + receptkomponent.getReceptId() + ", " + receptkomponent.getRaavareId() + ", " + receptkomponent.getNomNetto() + ", " + 
				receptkomponent.getTolerance()  + ")"
			);

	}

	@Override
	public void updateReceptKomp(ReceptKompDTO receptkomponent)
			throws DALException {
		Connector.doUpdate(
				"update receptkomponent set nom_netto = " + receptkomponent.getNomNetto() + ", tolerance = " + receptkomponent.getTolerance()
						  + " WHERE recept_id = " + receptkomponent.getReceptId() + " and raavare_id = " + receptkomponent.getRaavareId()
		);


	}

}
