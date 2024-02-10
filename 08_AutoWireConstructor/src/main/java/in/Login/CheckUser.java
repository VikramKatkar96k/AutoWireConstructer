package in.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.User.password;

@Component
public class CheckUser {
	private password pwd;

	public CheckUser() {
		System.out.println("CheckUser :: Constructor called ");
	}

	@Autowired
	CheckUser(password pwd) {
		System.out.println("parameter constructor ");
		this.pwd = pwd;
	}

	public void getPwd(String pwd) {
		String method = this.pwd.IMethod(pwd);
		System.out.println(method);
	}
}
