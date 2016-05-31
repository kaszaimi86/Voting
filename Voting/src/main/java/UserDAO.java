import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("unused")
public class UserDAO implements IUserDAO {
	
	private Connection connection;
    private Statement statement;	

	public UserDAO() {}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersWhoVoted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersFirstName(String FirstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersLastName(String Lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modUser(User user) {
		// TODO Auto-generated method stub
		
	}

	
	

}
