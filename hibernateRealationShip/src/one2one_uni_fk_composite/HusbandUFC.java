package one2one_uni_fk_composite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

@Entity
public class HusbandUFC {
	private int id;
	private String name;
	private WifeUFC wife;
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
    @JoinColumns(
    		{
    			@JoinColumn(name="wifeId", referencedColumnName="id"),	
    			@JoinColumn(name="wifeName", referencedColumnName="name")	
    		}
   )
	public WifeUFC getWife() {
		return wife;
	}
	public void setWife(WifeUFC wife) {
		this.wife = wife;
	}
	
	
}
