import java.util.List;


public interface IUserDAO {
	
	public List <User> getAllUsers ();
	public List <User> getUsersWhoVoted ();
	public List <User> getUsersFirstName (String FirstName);
	public List <User> getUsersLastName (String Lastname);
	public User getUserById(int id);
	
	public void modUser (User user);
	
	
	

}
