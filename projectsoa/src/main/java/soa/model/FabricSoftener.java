package soa.model;
// Generated Mar 28, 2024, 12:05:20 AM by Hibernate Tools 6.3.1.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * FabricSoftener generated by hbm2java
 */
public class FabricSoftener implements java.io.Serializable {

	private Integer id;
	private String name;
	private int price;
	@JsonIgnore
	private Set orderses = new HashSet(0);

	public FabricSoftener() {
	}

	public FabricSoftener(String name, int price, Set orderses) {
		this.name = name;
		this.price = price;
		this.orderses = orderses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}
