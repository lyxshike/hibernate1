package many2many_uni;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class Student {
    private int id;
    private String name;
    private Set<Teacher> group = new HashSet<Teacher>();
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
	@ManyToMany
	@JoinTable(name="t_s",
	    joinColumns={@JoinColumn(name="tid")},
	    inverseJoinColumns={@JoinColumn(name="sid")}
	)
	public Set<Teacher> getGroup() {
		return group;
	}
	public void setGroup(Set<Teacher> group) {
		this.group = group;
	}

     
    
}
