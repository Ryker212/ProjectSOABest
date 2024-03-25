package soa.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.model.Orders;
import soa.repository.OrdersRepository;


@RestController
@RequestMapping("/order")
public class OrdersService {
	
	@Autowired
	private OrdersRepository ordersRepository;
	
	@GetMapping("/")
	public JSONArray getAllOrders() {
		
		List<Object> object = ordersRepository.getOrders();
		JSONArray jsonArray = new JSONArray();
		for(Object result: object) {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("id",result);
			jsonObject.put("name",result);
			jsonArray.put(jsonObject);
			System.out.println(result);
		}

		return jsonArray ;

	}
}
