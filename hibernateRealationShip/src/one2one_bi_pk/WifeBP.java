package one2one_bi_pk;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class WifeBP {
	private int id;
	private String name;
	private HusbandBP husbandBP;
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
	public HusbandBP getHusbandBP() {
		return husbandBP;
	}
	public void setHusbandBP(HusbandBP husbandBP) {
		this.husbandBP = husbandBP;
	}
	
	
	
	
}
