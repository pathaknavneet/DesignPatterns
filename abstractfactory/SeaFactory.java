package abstractfactory;

public class SeaFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Shark();
	}

}
