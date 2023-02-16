package Medicare.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Medicare.DTO.Medicine;
import Medicare.DTO.kyaNamDe;
import Medicare.repro.kyaNamDeRepo;
import Medicare.repro.medicineRepo;
import Medicare.service.medicineService;
//import Medicare.controller.*;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("api/medicare")
public class MedicineController 
{
	/*
	 * Medicine Repo
	 */
	@Autowired
	medicineRepo mrepo;
	
	/*
	 * Medicine Service
	 */
	@Autowired
	medicineService mserv;
	
	MainController mCon=new MainController();
	
	@Autowired
	kyaNamDeRepo kndRepo;
	
	
	@PostMapping("/updatemedicine")
	public String UpdateMedicine(@RequestBody Medicine m)
	{
		String img=m.getImage();
		m.setImage("../../assets/"+img.substring(12 , img.length()));
		mserv.Medicineupdate(m);
		
		return "Update Done";
	}
	
	
	@GetMapping("/viewcart")
	public List<Medicine> View()
	{
		List<Medicine> m= mserv.list();
		return m;
	}
	
//	List<Medicine> m= new ArrayList<>();
	
//	@PostMapping("/addToCart/{id}")
//	public int addToCart(@PathVariable(value = "id") int a)
//	{
//		System.out.println(a+"lauraalehsun"+mCon.userLogin);
//		Medicine p=mrepo.findById(a).get();
////		List<Medicine> m= new ArrayList<>(); 
//		kyaNamDe kd=new kyaNamDe(mCon.userLogin,a);
//		kndRepo.save(kd);
//		m.add(p);
//		return a;
//	}
	
	
//	@GetMapping("/showCart")
//	public List<Medicine> showCart()
//	{
//		
//		return m;
//	}
	
	
	
	 @DeleteMapping(path = "/deleteproduct/{id}")
	    public String deleteProduct(@PathVariable(value = "id") int id)
	    {
	        boolean deletecustomer =mserv.deleteProduct(id);
	        return "null";
	    }
	
}
