package abstractfactory;

public class SampleAbstractFactory {
	
	public static void main(String[] args) {
		new Wonderland(createAnimalFactory("water"));

	}
	
	public static AnimalFactory createAnimalFactory(String type){
		if(type.equals("water")){
			return new SeaFactory();
			
		}
		else if(type.equals("land"))
		{
			return new LandFactory();
		}
		return null;
	}
}
