package soa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import soa.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
//	@Query("from person p where p.name=:name")
//	public Person findByName(@Param("name") String name);

}
