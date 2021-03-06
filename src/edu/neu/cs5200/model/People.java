package edu.neu.cs5200.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: People
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED) 

class People implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public People() {
		super();
	}
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	
}
