package soa.service;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestService {
	
	
	
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		HttpHeaders header =  new HttpHeaders();
		return new ResponseEntity<>("API test",header,HttpStatus.OK);
	}

}
