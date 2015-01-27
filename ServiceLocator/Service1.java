package serviceloc;

public class Service1 implements service{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "service1";
	}

	@Override
	public void execute() {
		System.out.println("executing service1");
	}

}
