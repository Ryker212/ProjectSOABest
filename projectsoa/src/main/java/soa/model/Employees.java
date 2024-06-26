package soa.model;
// Generated Mar 28, 2024, 12:05:20 AM by Hibernate Tools 6.3.1.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Employees generated by hbm2java
 */
public class Employees implements java.io.Serializable {

	private Integer id;
	private String username;
	private String position;
	private String name;
	private String pass;
	@JsonIgnore
	private Set ordersesForCheckerId = new HashSet(0);
	@JsonIgnore
	private Set ordersesForSenderId = new HashSet(0);
	@JsonIgnore
	private Set ordersesForRecieverId = new HashSet(0);
	public Employees( String username, String position, String name, String pass) {
		super();
		this.username = username;
		this.position = position;
		this.name = name;
		this.pass = pass;
	}

	public Employees() {
	}

	public Employees(String username, String position, String name, String pass, Set ordersesForCheckerId,
			Set ordersesForSenderId, Set ordersesForRecieverId) {
		this.username = username;
		this.position = position;
		this.name = name;
		this.pass = pass;
		this.ordersesForCheckerId = ordersesForCheckerId;
		this.ordersesForSenderId = ordersesForSenderId;
		this.ordersesForRecieverId = ordersesForRecieverId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Set getOrdersesForCheckerId() {
		return this.ordersesForCheckerId;
	}

	public void setOrdersesForCheckerId(Set ordersesForCheckerId) {
		this.ordersesForCheckerId = ordersesForCheckerId;
	}

	public Set getOrdersesForSenderId() {
		return this.ordersesForSenderId;
	}

	public void setOrdersesForSenderId(Set ordersesForSenderId) {
		this.ordersesForSenderId = ordersesForSenderId;
	}

	public Set getOrdersesForRecieverId() {
		return this.ordersesForRecieverId;
	}

	public void setOrdersesForRecieverId(Set ordersesForRecieverId) {
		this.ordersesForRecieverId = ordersesForRecieverId;
	}

}
