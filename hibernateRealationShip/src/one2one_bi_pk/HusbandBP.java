package one2one_bi_pk;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class HusbandBP {
	private int id;
	private String name;
	private WifeBP wifeBP;
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
	public WifeBP getWifeBP() {
		return wifeBP;
	}
	public void setWifeBP(WifeBP wifeBP) {
		this.wifeBP = wifeBP;
	}
	
	
	
	
	
	
	
}
