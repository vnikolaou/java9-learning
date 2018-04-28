package c.lib;

import java.util.*;
import static java.util.ServiceLoader.Provider;
import java.util.stream.*;
import java.util.List;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public interface UserService {
    static ServiceLoader<UserService> loader = ServiceLoader.load(UserService.class);
    static Map<String, Iterable<UserService>> cache = new HashMap<String, Iterable<UserService>>();

    public User getUser();
	
    public static Iterable<UserService> getAllProviders1() { 
	return loader;
    } 

    public static Iterable<UserService> getAllProviders() { 
        if(cache.get("reg") == null) {
		cache.put("reg", loader
		    .stream()                                              
		    .filter(p -> p.type().isAnnotationPresent(Order.class))  
		    .sorted(comparing(p -> p.type().getAnnotation(Order.class).value()))
		    .map(Provider::get)                                    
		    .collect(Collectors.toList()));
	}
	return cache.get("reg");
    } 
 
    public static void reload() {
	loader.reload();
    }

}
