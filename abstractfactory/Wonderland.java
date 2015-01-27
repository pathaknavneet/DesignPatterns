package abstractfactory;

public class Wonderland {

	public Wonderland(AnimalFactory animalFactory){
			Animal animal=animalFactory.createAnimal();
			animal.breathe();
	}
}
