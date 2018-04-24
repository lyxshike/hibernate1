package compositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;

//@Embeddable
public class TeacherPK implements Serializable	 {
	private int id;
	private String name;
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
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TeacherPK){
			TeacherPK pk = (TeacherPK)obj;
			if(this.id == pk.getId() && this.name == pk.getName()){
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	
	
}
