package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

	
	private static Map<String, Shape> shapeMap=new HashMap<String, Shape>();
	
	public static Shape getCachedShape(String id) throws CloneNotSupportedException{
		Shape shape=shapeMap.get(id);
		return (Shape)shape.clone();
	}
	
	public static void loadCache(){
		 Circle circle = new Circle();
	      circle.setId("1");
	      shapeMap.put(circle.getId(),circle);
	      
	      Rectangle rectangle = new Rectangle();
	      rectangle.setId("3");
	      shapeMap.put(rectangle.getId(), rectangle);
	  
	}
}
