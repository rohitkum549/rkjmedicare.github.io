package Medicare.repro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import Medicare.DTO.Medicine;

@Repository
@EnableJpaRepositories
public interface medicineRepo extends JpaRepository<Medicine, Integer>
{
	

}
