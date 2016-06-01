
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

public class User {
	
	@Entity
	@Table(name = "user")
	private int Id;
	private String LastName;
	private String FirstName;
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
	public User(String lastName, String firstName) {
		
		LastName = lastName;
		FirstName = firstName;
		isVoted = false;
	}
	@Override
	public String toString() {
		return "User [LastName=" + LastName + ", FirstName=" + FirstName + ", Id=" + Id + ", Voted=" + isVoted + "]";
	}
	
	

	
	
}
