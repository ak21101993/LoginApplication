package login.system.application.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	
	private Long id;
	private String username;
	private String password;
	private String passwordConfirm;
	private String Mobile;
	private Date DOB;
	private String address;
	private Set<Role> roles;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
	    return id;
	}

	public void setId(Long id) {
	    this.id = id;
	}

	public String getUsername() {
	    return username;
	}

	public void setUsername(String username) {
	    this.username = username;
	}

	public String getPassword() {
	    return password;
	}

	public void setPassword(String password) {
	    this.password = password;
	}
	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Transient
	public String getPasswordConfirm() {
	    return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
	    this.passwordConfirm = passwordConfirm;
	}

	@ManyToMany
	@JoinTable(name = "user_role", 
	joinColumns = @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	public Set<Role> getRoles() {
	    return roles;
	}

	public void setRoles(Set<Role> roles) {
	    this.roles = roles;
	}

}
