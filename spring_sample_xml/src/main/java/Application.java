import java.security.Provider.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		//CustomerService service =new CustomerServiceImpl();
		
		ApplicationContext appContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service =appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
