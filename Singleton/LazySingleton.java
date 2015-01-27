package singleton;

public class LazySingleton {

	private static LazySingleton singleton;
	
	private LazySingleton(){
		
	}
	public static LazySingleton getInstance(){
		if(null==singleton){
			System.out.println("creating singleton instance");
			singleton=new LazySingleton();
		}
		return singleton;
	}
	public void printSingleton(){
		System.out.println("print singleton");
		
	}
	
	public static void main(String[] args) {
		
		LazySingleton s1=LazySingleton.getInstance();
		LazySingleton s2=LazySingleton.getInstance();
	    s1.printSingleton();
	    s2.printSingleton();
	
	}

}
