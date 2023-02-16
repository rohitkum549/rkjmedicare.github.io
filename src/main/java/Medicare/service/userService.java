package Medicare.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Medicare.DTO.User;
import Medicare.repro.userRepo;

@Service
public class userService 
{
	@Autowired
	userRepo repo;
	public void Signup(User u)
	{
		repo.save(u);
	}
	
	
	public boolean authenticate(User u) {
		
		List<User> user= new ArrayList<User>();
		repo.findAll().forEach(i -> user.add(i));
		for(int i=0;i<user.size();i++) 
		{
			if(user.get(i).getEmail().equals(u.getEmail()) && user.get(i).getPassword().equals(u.getPassword()))
				return true;
		}
		return false;
//	    User user = repo.findById(u.getEmail())
//	    if (user != null && user.getPassword().equals(u.getPassword())) {
//	      return true;
//	    }
//	    return false;
	  }
}
