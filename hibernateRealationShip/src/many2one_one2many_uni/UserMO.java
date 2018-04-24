package many2one_one2many_uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_usermo")
public class UserMO {
    private int id;
    private String name;
    private GroupMO groupMO;
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
	@ManyToOne
	public GroupMO getGroupMO() {
		return groupMO;
	}
	public void setGroupMO(GroupMO groupMO) {
		this.groupMO = groupMO;
	}
}
