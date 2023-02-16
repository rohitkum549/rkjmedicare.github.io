package Medicare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Medicare.DTO.Medicine;
import Medicare.repro.medicineRepo;

@Service
public class medicineService 
{
	@Autowired
	medicineRepo mediRepo;
	
	
	
	public void Medicineupdate(Medicine m)
	{
		mediRepo.save(m);
	}
	
	
	
	
	public List<Medicine> list()
	{
		return mediRepo.findAll();
	}

	
	
	
    public boolean deleteProduct(int id) {
 
        if(mediRepo.existsById(id))
        {
            mediRepo.deleteById(id);
        }
        else
        {
            System.out.println("customer id not found");
        }
        return true;
    }
}
