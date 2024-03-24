package soa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import soa.model.WaterTemperature;

@Repository
public interface WaterTemperatureRepository extends CrudRepository<WaterTemperature, Integer> {

}
