package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService service = context.getBean("service",ICustomerService.class);
		service.add();

	}
	
	//IoC - Inversion of Control
	//Dependency Injection

}
