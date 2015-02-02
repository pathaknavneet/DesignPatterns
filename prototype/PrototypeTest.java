package prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		 ShapeCache.loadCache();

	      Shape clonedShape = (Shape) ShapeCache.getCachedShape("1");
	      System.out.println("Shape : " + clonedShape.getType());		

	      Shape clonedShape3 = (Shape) ShapeCache.getCachedShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());	

	}

}
