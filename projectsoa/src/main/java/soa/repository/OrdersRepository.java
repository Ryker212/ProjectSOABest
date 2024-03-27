package soa.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import soa.model.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer>{
	 @Query(nativeQuery = true,value = "SELECT o.id as order_id, u.id as user_id, p.name as package_name, p.price as package_price, p.wash as package_wash, p.dry as package_dry, fs.name as softener_name, fs.price as softener_price, wt.name as temp_name, wt.price as temp_price , o.plusdry as order_plusdry, u.username as username, o.status as order_status, e3.name as reciever_name, e2.name as sender_name, e1.name as checker_name FROM orders AS o\r\n"
             + "INNER JOIN package AS p ON (o.package_id = p.id)\r\n"
             + "LEFT JOIN employees AS e1 ON (e1.id = o.checker_id)\r\n"
             + "INNER JOIN users AS u ON (u.id = o.customer_id)\r\n"
             + "LEFT JOIN employees AS e2 ON (e2.id = o.sender_id)\r\n"
             + "LEFT JOIN employees AS e3 ON (e3.id = o.reciever_id)\r\n"
             + "INNER JOIN fabric_softener AS fs ON fs.id = o.softrner_id\r\n"
             + "INNER JOIN water_temperature AS wt ON wt.id = o.temperature_id")
    List<Map<String, Object>> getOrders();
	 
	 @Query(nativeQuery = true,value = "SELECT o.id as order_id, u.id as user_id, p.name as package_name, p.price as package_price, p.wash as package_wash, p.dry as package_dry, fs.name as softener_name, fs.price as softener_price, wt.name as temp_name, wt.price as temp_price,  o.plusdry as order_plusdry, u.username as username, o.status as order_status, e3.name as reciever_name, e2.name as sender_name, e1.name as checker_name FROM orders AS o\r\n"
             + "INNER JOIN package AS p ON (o.package_id = p.id)\r\n"
             + "LEFT JOIN employees AS e1 ON (e1.id = o.checker_id)\r\n"
             + "INNER JOIN users AS u ON (u.id = o.customer_id)\r\n"
             + "LEFT JOIN employees AS e2 ON (e2.id = o.sender_id)\r\n"
             + "LEFT JOIN employees AS e3 ON (e3.id = o.reciever_id)\r\n"
             + "INNER JOIN fabric_softener AS fs ON fs.id = o.softrner_id\r\n"
             + "INNER JOIN water_temperature AS wt ON wt.id = o.temperature_id\r\n"
             + "WHERE u.id = :id")
    List<Map<String, Object>> getOrdersById(@Param("id") int id);
	 
	 @Query(nativeQuery = true,value = "SELECT o.status,COUNT(o.status) FROM orders AS o\r\n"
             + "WHERE o.status = :status GROUP BY o.status")
    List<Map<String, Object>> getOrdersBystatus(@Param("status") String status);
}