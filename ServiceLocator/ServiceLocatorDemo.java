package serviceloc;

public class ServiceLocatorDemo {
public static void main(String[] args) {

	      service service1 = ServiceLocator.getService("Service1");
	      service1.execute();
	      service1 = ServiceLocator.getService("Service2");
	      service1.execute();
	      service1 = ServiceLocator.getService("Service1");
	      service1.execute();
	      service1 = ServiceLocator.getService("Service2");
	      service1.execute();
}
}
