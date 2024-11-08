package koikingdom.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "role", nullable = false, length = 50)
    private String role;

    @Column(name = "fullname", length = 100)
    private String fullName;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "status", nullable = false)
    private boolean status;

	public Account() {
		super();
	}

	public Account(Integer id, String email, String password, String role, String fullName, String address,
			boolean status) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
		this.fullName = fullName;
		this.address = address;
		this.status = status;
	}
	
	

	public Account(String email, String password, String role, String fullName, String address, boolean status) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		this.fullName = fullName;
		this.address = address;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
