package soa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.dao.UsersDAO;
import soa.model.Users;

@RestController
@RequestMapping("/users")
public class UsersService {

	@Autowired
	private UsersDAO usersDAO ;
	
	
	@GetMapping("/")
	public List<Users> findAll() {

		return usersDAO.findAll();

	}

	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findByID(@PathVariable("id") int i) {
		HttpHeaders head = new HttpHeaders();
		Users object = usersDAO.findByID(i);
		if (object != null) {
			HttpStatus status = HttpStatus.OK;
			return new ResponseEntity<>(object, head, status);
		} else {
			HttpStatus status = HttpStatus.FORBIDDEN;
			return new ResponseEntity<>("Permission deniedsad", head, status);
		}
	}

	
	@PostMapping("/add")
	public ResponseEntity<Object> addUsers(@RequestBody Map<String, String> body) {
		HttpHeaders head = new HttpHeaders();
		Users object = usersDAO.add(body);
		if (object == null) {
			HttpStatus status = HttpStatus.BAD_REQUEST;
			return new ResponseEntity<>("Create Fail", head, status);
		} 
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<>(object, head, status);
	}
	@PostMapping("/login")
	public ResponseEntity<Object> loginUsers(@RequestBody Map<String, String> body) {
		HttpHeaders head = new HttpHeaders();
		Users object = usersDAO.login(body);
		if (object == null) {
			HttpStatus status = HttpStatus.UNAUTHORIZED;
			return new ResponseEntity<>("Invalid Username or password", head, status);
		} 
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<>(object, head, status);

	}
	
}