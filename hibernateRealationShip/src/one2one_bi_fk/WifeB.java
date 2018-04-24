package one2one_bi_fk;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class WifeB {
	private int id;
	private String name;
	private HusbandB husbandB;
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
	@OneToOne(mappedBy="wifeB")
	public HusbandB getHusbandB() {
		return husbandB;
	}
	public void setHusbandB(HusbandB husbandB) {
		this.husbandB = husbandB;
	}
	
	
}
