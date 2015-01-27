package serviceloc;

public class ServiceLocator {
private static Cache cache;

static {
	cache=new Cache();
}
public static service getService(String jndiName){
	service service = cache.getService(jndiName);

    if(service != null){
       return service;
    }

    InitialContext context = new InitialContext();
    service service1 = (service)context.lookup(jndiName);
    cache.addService(service1);
    return service1;
}
}
