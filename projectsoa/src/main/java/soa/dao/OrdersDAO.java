package soa.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import soa.model.Employees;
import soa.model.MyPackage;
import soa.model.Orders;
import soa.model.Users;
import soa.repository.OrdersRepository;

@Service
public class OrdersDAO {

	@Autowired
	private OrdersRepository ordersRepository;

	public List<Map<String, Object>> findAll() {
		List<Map<String, Object>> object = ordersRepository.getOrders();
		return object;
	}
}