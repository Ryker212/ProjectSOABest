package soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.dao.WaterTemperatureDAO;
import soa.model.WaterTemperature;

@RestController
@RequestMapping("/WaterTemperature")
public class WaterTemperatureService {
	
	@Autowired
	private WaterTemperatureDAO waterTemperatureDAO ;
	
	@GetMapping("/")
	public List<WaterTemperature> findAll() {

		return waterTemperatureDAO.findAll();

	}

}
