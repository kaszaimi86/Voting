import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "party")
public class Party {
	@Id
    	@GeneratedValue(strategy = GenerationType.AUTO)
    	private int Id;
	private String Name;
	private int Nr_of_votes;
	
	
	
	public Party(String name) {
		super();
		Name = name;
		Nr_of_votes = 0;
	}
	
	@Override
	public String toString() {
		return "Party [Name=" + Name + ", Nr_of_votes=" + Nr_of_votes + ", Id=" + Id + "]";
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNr_of_votes() {
		return Nr_of_votes;
	}
	public void setNr_of_votes(int nr_of_votes) {
		Nr_of_votes = nr_of_votes;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	

}
