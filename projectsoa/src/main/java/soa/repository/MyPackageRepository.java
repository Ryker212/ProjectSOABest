package soa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import soa.model.MyPackage;


@Repository
public interface MyPackageRepository extends CrudRepository<MyPackage, Integer> {

}
