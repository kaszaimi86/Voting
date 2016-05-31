
public class User {
	
	private String LastName;
	private String FirstName;
	private int Id;
	private boolean isVoted;
	
	public boolean isVoted() {
		return isVoted;
	}
	public void setVoted(boolean isVoted) {
		this.isVoted = isVoted;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public User(String lastName, String firstName, int id) {
		super();
		LastName = lastName;
		FirstName = firstName;
		Id = id;
		isVoted = false;
	}
	@Override
	public String toString() {
		return "User [LastName=" + LastName + ", FirstName=" + FirstName + ", Id=" + Id + ", Voted=" + isVoted + "]";
	}
	
	

	
	
}
