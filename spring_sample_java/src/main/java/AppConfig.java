import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		return new CustomerServiceImpl();
	}

}
