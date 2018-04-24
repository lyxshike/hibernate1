package many2one_one2many_uni;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_groupmo")
public class GroupMO {
    private int id;
    private String name;
    private Set<UserMO> userMO = new HashSet<UserMO>(); 
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
	@OneToMany(mappedBy="groupMO")
	public Set<UserMO> getUserMO() {
		return userMO;
	}
	public void setUserMO(Set<UserMO> userMO) {
		this.userMO = userMO;
	}

}
