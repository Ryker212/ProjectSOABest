package soa.model;
// Generated Mar 25, 2024, 1:32:21 AM by Hibernate Tools 6.3.1.Final

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	private Integer id;
	private Employees employeesByCheckerId;
	private Employees employeesBySenderId;
	private Employees employeesByRecieverId;
	private Users users;
	private WaterTemperature waterTemperature;
	private FabricSoftener fabricSoftener;
	private MyPackage package_;
	private int plusdry;
	private String status;

	public Orders() {
	}

	public Orders(Employees employeesByCheckerId, Employees employeesBySenderId, Employees employeesByRecieverId,
			Users users, WaterTemperature waterTemperature, FabricSoftener fabricSoftener, MyPackage package_,
			int plusdry, String status) {
		this.employeesByCheckerId = employeesByCheckerId;
		this.employeesBySenderId = employeesBySenderId;
		this.employeesByRecieverId = employeesByRecieverId;
		this.users = users;
		this.waterTemperature = waterTemperature;
		this.fabricSoftener = fabricSoftener;
		this.package_ = package_;
		this.plusdry = plusdry;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employees getEmployeesByCheckerId() {
		return this.employeesByCheckerId;
	}

	public void setEmployeesByCheckerId(Employees employeesByCheckerId) {
		this.employeesByCheckerId = employeesByCheckerId;
	}

	public Employees getEmployeesBySenderId() {
		return this.employeesBySenderId;
	}

	public void setEmployeesBySenderId(Employees employeesBySenderId) {
		this.employeesBySenderId = employeesBySenderId;
	}

	public Employees getEmployeesByRecieverId() {
		return this.employeesByRecieverId;
	}

	public void setEmployeesByRecieverId(Employees employeesByRecieverId) {
		this.employeesByRecieverId = employeesByRecieverId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public WaterTemperature getWaterTemperature() {
		return this.waterTemperature;
	}

	public void setWaterTemperature(WaterTemperature waterTemperature) {
		this.waterTemperature = waterTemperature;
	}

	public FabricSoftener getFabricSoftener() {
		return this.fabricSoftener;
	}

	public void setFabricSoftener(FabricSoftener fabricSoftener) {
		this.fabricSoftener = fabricSoftener;
	}

	public MyPackage getPackage() {
		return this.package_;
	}

	public void setPackage(MyPackage package_) {
		this.package_ = package_;
	}

	public int getPlusdry() {
		return this.plusdry;
	}

	public void setPlusdry(int plusdry) {
		this.plusdry = plusdry;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
