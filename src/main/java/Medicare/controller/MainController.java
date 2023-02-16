package Medicare.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Medicare.DTO.Medicine;
import Medicare.DTO.User;
import Medicare.DTO.kyaNamDe;
import Medicare.repro.kyaNamDeRepo;
import Medicare.repro.medicineRepo;
import Medicare.repro.userRepo;
import Medicare.service.medicineService;
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
	
	@Autowired
	medicineRepo mrepo;
	
	/*
	 * Medicine Service
	 */
	@Autowired
	medicineService mserv;
	
	
	@Autowired
	kyaNamDeRepo kndRepo;
		
	public boolean isUserLogin=false;
	public String userLogin="";
//	public  void loginTest()
//	{
//		boolean isUserLogin=false;
//		String userLogin="";
//	}
	
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
//		loginTest l=new loginTest();
		if(userv.authenticate(u))
		{
			signin=true;
			isUserLogin=true;
			userLogin=u.getEmail();
			System.out.println(userLogin);
			System.out.println("correct");
//			return u.getEmail();
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
	
	

	@PostMapping("/addToCart/{id}")
	public int addToCart(@PathVariable(value = "id") int a)
	{
		System.out.println(a+"____"+userLogin);
		Medicine p=mrepo.findById(a).get();
//		List<Medicine> m= new ArrayList<>();
		
		kyaNamDe kd=new kyaNamDe();
		kd.setUemail(userLogin);
		kd.setPid(a);
		kndRepo.save(kd);
//		m.add(p);
		return a;
	}
	
	
	@GetMapping("/showCart")
	public List<Medicine> showCart()
	{
		kyaNamDe m= kndRepo.findById(userLogin).get();
		List<Medicine> toti= new ArrayList<>();
		Medicine mo=mrepo.findById(m.getPid()).get();
		toti.add(mo);
		return toti;
	}
}
