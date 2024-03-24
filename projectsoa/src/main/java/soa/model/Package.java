package soa.model;
// Generated Mar 24, 2024, 4:22:54 PM by Hibernate Tools 6.3.1.Final

/**
 * Package generated by hbm2java
 */
public class Package implements java.io.Serializable {

	private Integer id;
	private Orders orders;
	private String name;
	private int price;
	private int wash;
	private int dry;

	public Package() {
	}

	public Package(Orders orders, String name, int price, int wash, int dry) {
		this.orders = orders;
		this.name = name;
		this.price = price;
		this.wash = wash;
		this.dry = dry;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
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

	public int getWash() {
		return this.wash;
	}

	public void setWash(int wash) {
		this.wash = wash;
	}

	public int getDry() {
		return this.dry;
	}

	public void setDry(int dry) {
		this.dry = dry;
	}

}