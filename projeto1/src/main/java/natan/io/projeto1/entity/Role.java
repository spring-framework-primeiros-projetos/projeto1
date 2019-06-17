package natan.io.projeto1.entity;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Role {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO);
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@ManyToMany
	private Set<Role> roles;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Role> getroRoles() {
		return roles;
	}
	
	public void SetRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
