package soa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import soa.model.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer>{
	@Query(nativeQuery = true,
            value = "SELECT o.id as Id FROM orders AS o\r\n"
            		+ "INNER JOIN package AS p ON (o.package_id = p.id)\r\n"
            		+ "INNER JOIN employees AS e1 ON (e1.id = o.checker_id)\r\n"
            		+ "INNER JOIN users AS u ON (u.id = o.customer_id)\r\n"
            		+ "INNER JOIN employees AS e2 ON (e2.id = o.sender_id)\r\n"
            		+ "INNER JOIN employees AS e3 ON (e3.id = o.reciever_id)\r\n"
            		+ "INNER JOIN fabric_softener AS fs ON fs.id = o.softrner_id\r\n"
            		+ "INNER JOIN water_temperature AS wt ON wt.id = o.temperature_id")
     List<Object> getOrders();
}