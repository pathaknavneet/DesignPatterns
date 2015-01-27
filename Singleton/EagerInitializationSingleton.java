package singleton;

public class EagerInitializationSingleton {
	private static EagerInitializationSingleton singleton=new EagerInitializationSingleton();
	private EagerInitializationSingleton(){
		
	}
	public static EagerInitializationSingleton getInstance(){
		return singleton;
	}
	public void printSingleton(){
		System.out.println("in print singleton");
	}
	public static void main(String[] args) {
		EagerInitializationSingleton s1=EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton s2=EagerInitializationSingleton.getInstance();
	    s1.printSingleton();
	    s2.printSingleton();
}
}
