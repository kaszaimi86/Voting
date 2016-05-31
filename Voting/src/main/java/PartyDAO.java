import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("unused")
public class PartyDAO implements IPartyDAO {
	
	private Connection connection;
    private Statement statement;	

	public PartyDAO() {}

	@Override
	public List<Party> getAllParties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getVote(Party party) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVoteForParty(Party party) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVoteForPartyByID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVoteForPartyByName(String party) {
		// TODO Auto-generated method stub
		
	}
	

}
