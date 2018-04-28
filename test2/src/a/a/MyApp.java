package a;

import b.*;

public class MyApp {
	public static void main(String[] args) {
		System.out.println("Hello from a.MyApp");
	    try { 
	      Class<?> clazz = Class.forName("b.Calculator"); 
	      Calculator obj = (Calculator) clazz.getConstructor()
		              .newInstance(); // Create new instance 
	       System.out.println("1+2=" + obj.add(1,2));
	    } catch (ReflectiveOperationException e) { 
		System.out.println("Did not find the Calculator class"); 
	    } 
	}
}
