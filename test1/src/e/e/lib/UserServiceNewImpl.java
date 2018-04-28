package e.lib;

import c.lib.*;

@Order(1)
public class UserServiceNewImpl implements UserService {
	private User user;

/*
	public static UserService provider() {
		return new UserServiceNewImpl();
	}
*/

	public UserServiceNewImpl() {
		System.out.println("Creating UserServiceNewImpl..");
		this.user = new User("vnikolaou1");
	}

	public User getUser() { 
		return this.user;
	}

}
