import java.sql.SQLException;
import java.util.List;


public interface IPartyDAO {
	
	public List <Party> getAllParties()throws SQLException;
	public int getVote(Party party)throws SQLException;

	public void setVoteForParty(Party party)throws SQLException;
	public void setVoteForPartyByID(int id)throws SQLException;
	public void setVoteForPartyByName(String party)throws SQLException;
	
}
