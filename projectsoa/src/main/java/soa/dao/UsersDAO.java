package soa.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soa.model.Users;
import soa.repository.UsersRepository;

@Service
public class UsersDAO {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public List<Users> findAll(){
		return (List<Users>) usersRepository.findAll();
	}
	
	public Users findByID(int i) {
		return usersRepository.findById(i).get();
	}
	

	public Users add(Map<String, String> body) {
		String username = body.get("username");
		String pass = body.get("pass");
		String name = body.get("name");
		String tel = body.get("tel");
		String address = body.get("address");
		Integer extra = Integer.parseInt(body.get("extra"));
		Users newUser = new Users(username, pass, name, tel, address, extra);
		return usersRepository.save(newUser);
	}
	public Users login(Map<String, String> body) {
		String username = body.get("username");
		String pass = body.get("pass");
		Integer i=null;
		List<Users> userList = findAll();
		
		
		for (Users user : userList) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPass().equals(pass)) {
				i = user.getId();
				return usersRepository.findById(i).get();
			}
		}
		return null;
	}
	

}
