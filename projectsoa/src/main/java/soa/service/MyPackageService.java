package soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.dao.MyPackageDAO;
import soa.model.MyPackage;
import soa.model.Users;


@RestController
@RequestMapping("/package")
public class MyPackageService {

	@Autowired
	private MyPackageDAO packageDAO ;
	
	@GetMapping("/")
	public List<MyPackage> findAll() {

		return packageDAO.findAll();

	}
}
