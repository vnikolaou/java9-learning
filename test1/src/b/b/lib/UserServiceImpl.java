package b.lib;

import c.lib.*;

@Order(2)
public class UserServiceImpl implements UserService {
	private User user;
/*
	public static UserService provider() {
		return new UserServiceImpl();
	}
*/
	public UserServiceImpl() {
		System.out.println("Creating UserServiceImpl..");
		this.user = new User("vnikolaou");
	}

	public User getUser() { 
		return this.user;
	}

}
