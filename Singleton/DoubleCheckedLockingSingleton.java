package singleton;

public class DoubleCheckedLockingSingleton implements Cloneable{
	private static DoubleCheckedLockingSingleton singleton;

	private DoubleCheckedLockingSingleton() {

	}

	public static  DoubleCheckedLockingSingleton getInstance() {
		if (null == singleton) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (null == singleton) {
					System.out.println("creating singleton instance");
					singleton = new DoubleCheckedLockingSingleton();
				}
			}

		}
		return singleton;
	}

	public void printSingleton() {
		System.out.println("print singleton");

	}
		public Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException(); 
	}

	public static void main(String[] args) {
		 DoubleCheckedLockingSingleton s3=null;
		DoubleCheckedLockingSingleton s1=DoubleCheckedLockingSingleton.getInstance();
		DoubleCheckedLockingSingleton s2=DoubleCheckedLockingSingleton.getInstance();
	    s1.printSingleton();
	    s2.printSingleton();
	
	    try{
	    	s3=(DoubleCheckedLockingSingleton)s1.clone();
	    }catch(CloneNotSupportedException ce){
	    	System.out.println(ce);
	    }
	    
	    System.out.println(s3==s1);
	}

}
