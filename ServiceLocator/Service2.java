package serviceloc;

public class Service2 implements service {

	@Override
	public String getName() {
		return "service2";
	
	}

	@Override
	public void execute() {
	System.out.println("Executing Service2");
		
	}

}
