package soa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soa.model.FabricSoftener;
import soa.repository.SoftenerRepository;

@Service
public class SoftennerDAO {
	
	@Autowired
	private SoftenerRepository softenerRepository;
	
	public List<FabricSoftener> findAll(){
		return (List<FabricSoftener>) softenerRepository.findAll();
	}
}
