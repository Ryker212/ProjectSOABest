package soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.dao.SoftennerDAO;
import soa.model.FabricSoftener;


@RestController
@RequestMapping("/softener")
public class SoftenerService {
	
	@Autowired
	private SoftennerDAO  softennerDAO;
	
	@GetMapping("/")
	public List<FabricSoftener> findAll() {

		return softennerDAO.findAll();

	}
}
