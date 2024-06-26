package soa.service;

import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.dao.OrdersDAO;
import soa.model.Orders;
import soa.model.Users;
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
	@GetMapping("/{id}")
	public List<Map<String, Object>> getAllOrdersById(@PathVariable("id") int id) {
		  
		  List<Map<String, Object>> object = ordersDAO.findById(id);

		  return object ;

	}
	
	@GetMapping("/userId/{id}")
	public List<Map<String, Object>> getAllOrdersByUserId(@PathVariable("id") int id) {
		  
		  List<Map<String, Object>> object = ordersDAO.findByUser(id);

		  return object ;

	}
	@GetMapping("/status/{status}")
	public List<Map<String, Object>> getOrdersBystatus(@PathVariable("status") String status) {
		  
		  List<Map<String, Object>> object = ordersDAO.findByStatus(status);

		  return object ;
	}
	@PostMapping("/add")
	public ResponseEntity<Object> addOrder(@RequestBody Map<String, String> body) {
		HttpHeaders head = new HttpHeaders();
		Orders object = ordersDAO.add(body);
		//System.out.println("check: "+object);
		if (object == null) {
			HttpStatus status = HttpStatus.BAD_REQUEST;
			return new ResponseEntity<>("Create Fail", head, status);
		} 
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<>(object, head, status);
	}
	@PutMapping("/updateChecker/{id}")
	public String updateOrderChecker(@RequestBody Map<String, String> body,@PathVariable("id") int i) {
		//HttpHeaders head = new HttpHeaders();
		Orders object = ordersDAO.updateChecker(body,i);
		//System.out.println("check: "+object);
//		if (object == null) {
//			HttpStatus status = HttpStatus.BAD_REQUEST;
//			return new ResponseEntity<>("Create Fail", head, status);
//		} 
		//HttpStatus status = HttpStatus.OK;
		return ("Update Checker Success");
	}
	@PutMapping("/updateReciever/{id}")
	public String updateOrderReciever(@RequestBody Map<String, String> body,@PathVariable("id") int i) {
		//HttpHeaders head = new HttpHeaders();
		Orders object = ordersDAO.updateReciever(body,i);
		//System.out.println("check: "+object);
//		if (object == null) {
//			HttpStatus status = HttpStatus.BAD_REQUEST;
//			return new ResponseEntity<>("Create Fail", head, status);
//		} 
//		HttpStatus status = HttpStatus.OK;
		return ("Update Reciever Success");
	}
	@PutMapping("/updateSender/{id}")
	public String updateOrderSender(@RequestBody Map<String, String> body,@PathVariable("id") int i) {
		//HttpHeaders head = new HttpHeaders();
		Orders object = ordersDAO.updateSender(body,i);
		//System.out.println("check: "+object);
//		if (object == null) {
//			HttpStatus status = HttpStatus.BAD_REQUEST;
//			return new ResponseEntity<>("Create Fail", head, status);
//		} 
//		HttpStatus status = HttpStatus.OK;
		return ("Update Sender Success");
	}
	
	@PutMapping("/updateStatus/{id}")
	public String updateStatus(@RequestBody Map<String, String> body,@PathVariable("id") int i) {
		//HttpHeaders head = new HttpHeaders();
		Orders object = ordersDAO.updateStatus(body,i);
		//System.out.println("check: "+object);
//		if (object == null) {
//			HttpStatus status = HttpStatus.BAD_REQUEST;
//			return new ResponseEntity<>("Create Fail", head, status);
//		} 
//		HttpStatus status = HttpStatus.OK;
		return ("Update Status Success");
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteOrder(@PathVariable("id") int i) {
		boolean j = ordersDAO.delete(i);
		if (j == false) {
			return ("Delete Order Fail");
		} 
		else {
		return ("Delete Order Success");}
	}
}
