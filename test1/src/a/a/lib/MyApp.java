package a.lib;

import c.lib.*;
import java.io.*;

public class MyApp {
	public static void main(String[] args) {
		inspect();

		inspect();

		inspect1();

		inspect1();

		waitme();

		UserService.reload();

		inspect();

		inspect();

		inspect1();

		inspect1();
	}

	private static void waitme() {
		try {
			System.out.print("Hit a button to continue: ");
			System.in.read();
		 } catch (IOException e) {
			e.printStackTrace();
		 }
	}

	private static void inspect() {
		System.out.println("Using stream...");
		Iterable<UserService> userServices = UserService.getAllProviders();
		for (UserService us : userServices) { 
		     System.out.println("username: " + us.getUser().getUsername() + ", hash=" + us.hashCode());
		} 
	}

	private static void inspect1() {
		System.out.println("Using iterator...");
		Iterable<UserService> userServices = UserService.getAllProviders1();
		for (UserService us : userServices) { 
		     System.out.println("username: " + us.getUser().getUsername() + ", hash=" + us.hashCode());
		} 
	}
}
