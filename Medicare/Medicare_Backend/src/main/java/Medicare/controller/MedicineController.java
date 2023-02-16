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
import Medicare.repro.medicineRepo;
import Medicare.service.medicineService;

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
	
	
	@PostMapping("/addToCart")
	public int addToCart(int a)
	{
		System.out.println(a);
		return a;
	}
	
	
	@GetMapping("/showCart")
	public List<Medicine> showCart()
	{
		Medicine p=mrepo.findById(252).get();
		List<Medicine> m= new ArrayList(); 
		m.add(p);
//		List<Medicine> m= mserv.list();
		return m;
	}
	
	
	
	 @DeleteMapping(path = "/deleteproduct/{id}")
	    public String deleteProduct(@PathVariable(value = "id") int id)
	    {
	        boolean deletecustomer =mserv.deleteProduct(id);
	        return "null";
	    }
	
	 
//	 public String updateMedicine(@RequestBody Medicine medi)
//	 {
//		 String mediId=mserv.updateMedicine(medi);
//		 return mediId;
//	 }
}
