package one2one_uni_pk;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class HusbandUP {
	private int id;
	private String name;
	private WifeUP wifeUP;
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
	@PrimaryKeyJoinColumn
	public WifeUP getWifeUP() {
		return wifeUP;
	}
	public void setWifeUP(WifeUP wifeUP) {
		this.wifeUP = wifeUP;
	}
	
	
	
	
}
