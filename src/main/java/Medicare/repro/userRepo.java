package Medicare.repro;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import Medicare.DTO.User;

@EnableJpaRepositories
@Repository
public interface userRepo extends JpaRepository<User, String>
{
	
}
