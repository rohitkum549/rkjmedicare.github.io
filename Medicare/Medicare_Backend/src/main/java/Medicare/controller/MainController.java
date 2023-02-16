package Medicare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Medicare.DTO.User;
import Medicare.repro.userRepo;
import Medicare.service.userService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("api/medicare")
public class MainController 
{
	/*
	 user Repo
	 */
	@Autowired
	userRepo urepo;
	/*
	 User Service 
	 */
	@Autowired
	userService userv;
		
	
	
	@PostMapping("/signup")
	public String Signup(@RequestBody User u)
	{
		userv.Signup(u);
		return "Signup Done";
	}
	
	
	
	boolean signin=false;
	@PostMapping("/login")
	public String Login(@RequestBody User u)
	{
		if(userv.authenticate(u))
		{
			signin=true;
			System.out.println("correct");
//			return ;
		}
		else
		{
			signin=false;
			System.out.println("Wrong");
		}
		return "Login Successfully";
	}
	@GetMapping("/login")
	public boolean LoginDone()
	{
		return signin;
	}

}
