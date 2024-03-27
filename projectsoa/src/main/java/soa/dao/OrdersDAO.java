package soa.dao;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import soa.model.Employees;
import soa.model.MyPackage;
import soa.model.Orders;
import soa.repository.OrdersRepository;

@Service
public class OrdersDAO {

	@Autowired
	private OrdersRepository ordersRepository;

	public List<Map<String, Object>> findAll() {
		List<Map<String, Object>> object = ordersRepository.getOrders();
		return object;
	}
	
//	public Orders add(Map<String, String> body) {
//		Integer employeesByCheckerId = Integer.parseInt(body.get("employeesByCheckerId"));
//		Integer employeesBySenderId = Integer.parseInt(body.get("employeesBySenderId"));
//		Integer employeesByRecieverId = Integer.parseInt(body.get("employeesByRecieverId"));
//		Integer users = Integer.parseInt(body.get("users"));
//		Integer waterTemperature = Integer.parseInt(body.get("waterTemperature"));
//		Integer fabricSoftener = Integer.parseInt(body.get("fabricSoftener"));
//		Integer package_ = Integer.parseInt(body.get("package_"));
//		int plusdry = Integer.parseInt(body.get("plusdry"));
//		String status = body.get("status");
//		System.out.println("CheckerId: "+employeesByCheckerId);
//		Orders newOrder = new Orders(employeesByCheckerId, employeesBySenderId, employeesByRecieverId, users, waterTemperature, fabricSoftener,package_,plusdry,status);
//		return ordersRepository.save(newOrder);
//	}
	public Orders add(Map<String, String> body) {
		Integer users = Integer.parseInt(body.get("users"));
		Integer waterTemperature = Integer.parseInt(body.get("waterTemperature"));
		Integer fabricSoftener = Integer.parseInt(body.get("fabricSoftener"));
		Integer package_ = Integer.parseInt(body.get("package_"));
		int plusdry = Integer.parseInt(body.get("plusdry"));
		String status = body.get("status");
		Orders newOrder = new Orders( users, waterTemperature, fabricSoftener,package_,plusdry,status);
		return ordersRepository.save(newOrder);
	}

	public Orders updateChecker(Map<String, String> body, int i) {
		Orders o = ordersRepository.findById(i).get();
		
		Integer j = Integer.parseInt(body.get("employeesByCheckerId"));
		
		Integer employeesByCheckerId = j;
		Employees c = new Employees();
		c.setId(employeesByCheckerId);
		o.setEmployeesByCheckerId(c);
		
		return ordersRepository.save(o);
	}
	public Orders updateReciever(Map<String, String> body, int i) {
		Orders o = ordersRepository.findById(i).get();
		
		Integer j = Integer.parseInt(body.get("employeesByRecieverId"));
		
		Integer employeesByRecieverId = j;
		Employees c = new Employees();
		c.setId(employeesByRecieverId);
		o.setEmployeesByRecieverId(c);
		
		return ordersRepository.save(o);
	}
	public Orders updateSender(Map<String, String> body, int i) {
		Orders o = ordersRepository.findById(i).get();
		
		Integer j = Integer.parseInt(body.get("employeesBySenderId"));
		
		Integer employeesBySenderId = j;
		Employees c = new Employees();
		c.setId(employeesBySenderId);
		o.setEmployeesBySenderId(c);
		
		return ordersRepository.save(o);
	}
}