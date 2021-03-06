package personsAndAcademies.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Entities {
	
	//no arg constructor
	public Entities(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	public Long getID() {
		return ID;
	}
	public void setID(Long ID) {
		this.ID = ID;
	}

}
