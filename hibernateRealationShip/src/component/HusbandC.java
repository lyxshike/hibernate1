package component;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HusbandC {
	private int id;
	private String name;
	private WifeC wife;
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
	@Embedded
	public WifeC getWife() {
		return wife;
	}
	public void setWife(WifeC wife) {
		this.wife = wife;
	}
	
	
}
