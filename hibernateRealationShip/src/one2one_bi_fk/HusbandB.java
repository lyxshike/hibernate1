package one2one_bi_fk;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class HusbandB {
	private int id;
	private String name;
	private WifeB wifeB;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToOne
	@JoinColumn(name="wifeId")
	public WifeB getWifeB() {
		return wifeB;
	}
	public void setWifeB(WifeB wifeB) {
		this.wifeB = wifeB;
	}
	

	
	
}
