package in.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.Login.CheckUser;

@SpringBootApplication
@ComponentScan({"in.User","in.Login"})
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CheckUser checkUser = context.getBean(CheckUser.class);
		checkUser.getPwd("vikram");
	}

}
