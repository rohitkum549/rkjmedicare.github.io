package Medicare.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="kyaNamDe")
public class kyaNamDe 
{
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
	private String uemail;
	private int pid;
	
	public kyaNamDe()
	{
//		uemail=this.uemail;
//		pid=this.pid;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
} 
