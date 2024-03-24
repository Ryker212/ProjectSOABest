package soa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soa.model.MyPackage;
import soa.repository.MyPackageRepository;

@Service
public class MyPackageDAO {

	@Autowired
	private MyPackageRepository packageRepository;
	
	public List<MyPackage > findAll(){
		return (List<MyPackage >) packageRepository.findAll();
	}
}
