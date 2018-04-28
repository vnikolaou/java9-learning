package a;

import java.lang.reflect.*;

public class MyApp {
	public static void main(String[] args) {
		System.out.println("Hello from a.MyApp");
		    try { 
		      Class clazz = Class.forName("b.Calculator"); 
		      Constructor<?> ctor = clazz.getConstructor(); 
		      Object object = ctor.newInstance(new Object[] {  }); 
		      System.out.println("Successfully created object using reflection"); 
		 //     Calculator calc = (Calculator)obj;
		  //    System.out.println(calc.add(1,2));
		    } catch (ReflectiveOperationException e) { 
			e.printStackTrace();
			System.out.println("Did not find the Impl class module"); 
		    } 
	}
}
