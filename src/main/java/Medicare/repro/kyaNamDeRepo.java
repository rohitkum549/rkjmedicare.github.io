package Medicare.repro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import Medicare.DTO.kyaNamDe;

@Repository
@EnableJpaRepositories
public interface kyaNamDeRepo extends JpaRepository<kyaNamDe, String> 
{

}
