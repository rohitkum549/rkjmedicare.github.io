package Medicare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Medicare.repro.kyaNamDeRepo;

@Service
public class kyaNamDeService {

	@Autowired
	kyaNamDeRepo kndRepo;
}
