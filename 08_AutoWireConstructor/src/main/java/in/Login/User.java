package in.Login;

import org.springframework.stereotype.Component;

import in.User.password;
@Component
public class User implements password 
{
	@Override
	public String IMethod(String pwd) {
			if("vikram".equals(pwd))
			{
				return"User Login Seccessfull";
			}
		return "Pls Try Again Password is Wrong";
	}
	public User() {
		System.out.println("user Name is Valid");
	}
}
