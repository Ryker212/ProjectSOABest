package soa.res;

public class OrdersRes {
	//order
	private int id;
	//user
	private String nameUser;
	//package
	private String nameMypackage;
	private int priceMypackage;
	private int washMypackage;
	private int dryMypackage;
	//softener
	private String nameSoftener;
	private int priceSoftener;
	//temperature
	private String nameTemperature;
	private int priceTemperature;
	//emCheck
	private String nameChecker;
	
	public OrdersRes() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getNameMypackage() {
		return nameMypackage;
	}
	public void setNameMypackage(String nameMypackage) {
		this.nameMypackage = nameMypackage;
	}
	public int getPriceMypackage() {
		return priceMypackage;
	}
	public void setPriceMypackage(int priceMypackage) {
		this.priceMypackage = priceMypackage;
	}
	public OrdersRes(int id, String nameUser, String nameMypackage, int priceMypackage, int washMypackage,
			int dryMypackage, String nameSoftener, int priceSoftener, String nameTemperature, int priceTemperature,
			String nameChecker, String nameSender, String nameReciever) {
		super();
		this.id = id;
		this.nameUser = nameUser;
		this.nameMypackage = nameMypackage;
		this.priceMypackage = priceMypackage;
		this.washMypackage = washMypackage;
		this.dryMypackage = dryMypackage;
		this.nameSoftener = nameSoftener;
		this.priceSoftener = priceSoftener;
		this.nameTemperature = nameTemperature;
		this.priceTemperature = priceTemperature;
		this.nameChecker = nameChecker;
		this.nameSender = nameSender;
		this.nameReciever = nameReciever;
	}
	public int getWashMypackage() {
		return washMypackage;
	}
	public void setWashMypackage(int washMypackage) {
		this.washMypackage = washMypackage;
	}
	public int getDryMypackage() {
		return dryMypackage;
	}
	public void setDryMypackage(int dryMypackage) {
		this.dryMypackage = dryMypackage;
	}
	public String getNameSoftener() {
		return nameSoftener;
	}
	public void setNameSoftener(String nameSoftener) {
		this.nameSoftener = nameSoftener;
	}
	public int getPriceSoftener() {
		return priceSoftener;
	}
	public void setPriceSoftener(int priceSoftener) {
		this.priceSoftener = priceSoftener;
	}
	public String getNameTemperature() {
		return nameTemperature;
	}
	public void setNameTemperature(String nameTemperature) {
		this.nameTemperature = nameTemperature;
	}
	public int getPriceTemperature() {
		return priceTemperature;
	}
	public void setPriceTemperature(int priceTemperature) {
		this.priceTemperature = priceTemperature;
	}
	public String getNameChecker() {
		return nameChecker;
	}
	public void setNameChecker(String nameChecker) {
		this.nameChecker = nameChecker;
	}
	public String getNameSender() {
		return nameSender;
	}
	public void setNameSender(String nameSender) {
		this.nameSender = nameSender;
	}
	public String getNameReciever() {
		return nameReciever;
	}
	public void setNameReciever(String nameReciever) {
		this.nameReciever = nameReciever;
	}
	//emSennder
	private String nameSender;
	//emReciever
	private String nameReciever;


}
