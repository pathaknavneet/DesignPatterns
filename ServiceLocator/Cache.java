package serviceloc;

import java.util.ArrayList;
import java.util.List;

public class Cache {
List<service> servicesList=null;
public Cache(){
	servicesList=new ArrayList<service>();
}

public service getService(String serviceName){
	for(service service:servicesList){
	if(service.getName().equalsIgnoreCase(serviceName))	{
		System.out.println("Returning cached  "+serviceName+" object");	
		return service;
	}
	}
	return null;
}

public void addService(service newService){
	boolean exists=false ;
	for(service ser:servicesList){
		if(ser.getName().equalsIgnoreCase(newService.getName())){
			exists=true;
		}
	}
	if(!exists){
		servicesList.add(newService);
	}
	
}
}
