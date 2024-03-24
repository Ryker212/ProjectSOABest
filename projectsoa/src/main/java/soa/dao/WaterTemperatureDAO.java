package soa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soa.model.WaterTemperature;
import soa.repository.WaterTemperatureRepository;

@Service
public class WaterTemperatureDAO {

	@Autowired
	private WaterTemperatureRepository waterTemperatureRepository;
	
	public List<WaterTemperature> findAll(){
		return (List<WaterTemperature>) waterTemperatureRepository.findAll();
	}
	
}
