package ratam.io.Projeto1.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	private String name, email;
	@ManyToMany
	private Set<Role> role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
 