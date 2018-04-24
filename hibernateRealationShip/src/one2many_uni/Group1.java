package one2many_uni;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;

@Entity
@Table(name="t_group1")
public class Group1 {
    private int id;
    private String name;
    private Set<User1> user1 = new HashSet<User1>();
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
	@OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name="groupId")
	public Set<User1> getUser() {
		return user1;
	}
	public void setUser(Set<User1> user1) {
		this.user1 = user1;
	}
    
}
