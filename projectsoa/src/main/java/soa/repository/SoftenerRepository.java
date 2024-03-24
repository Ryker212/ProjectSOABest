package soa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import soa.model.FabricSoftener;

@Repository
public interface SoftenerRepository extends CrudRepository<FabricSoftener, Integer> {

}
