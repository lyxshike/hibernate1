package compositeKey;

import java.io.Serializable;

public class StudentPK implements Serializable	 {
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
		if(obj instanceof StudentPK){
			StudentPK pk = (StudentPK)obj;
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
