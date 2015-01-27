package serviceloc;

public class InitialContext {
	public Object lookup(String jndiName){
		if(jndiName.equalsIgnoreCase("service1")){
			System.out.println("creating and returning Service1 object");
		return new Service1();
		}
		if(jndiName.equalsIgnoreCase("service2")){
			System.out.println("creating and returning Service2 object");
			return new Service2();
		}
		return null;
	}
	
	}
