package soa.service;

import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.dao.OrdersDAO;
import soa.model.Orders;
import soa.repository.OrdersRepository;


@RestController
@RequestMapping("/order")
public class OrdersService {
	
	@Autowired
	OrdersDAO ordersDAO = new OrdersDAO();
	
	//@Autowired
	//private OrdersRepository ordersRepository;
	
	@GetMapping("/")
	 public List<Map<String, Object>> getAllOrders() {
		  
		  List<Map<String, Object>> object = ordersDAO.findAll();

		  return object ;

	}
}
