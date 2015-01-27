package factory;

public class CarFactory {

	public static Car buildCar(CarType model) {
		Car car=null;
		
		switch(model){
		case SMALL:
			car=new SmallCar();
			break;
		case SEDAN:
			car=new SedanCar();
			break;
		case LUXURY:
			car=new LuxuryCar();
			break;
		default:
			System.out.println("invalid car type");
			break;
			
			
		}
		return car;
	}
}
