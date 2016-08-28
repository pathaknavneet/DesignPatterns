import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestEnum {

  public static void main(String[] args) {
  direction.NORTH.displayAngle();
  System.out.println(direction.get(90));
  
  // enum set are not synchronized by default 
  // null elements are not permitted in a enum set 
  // retrieval in insertion order 
  Set enumSet = EnumSet.of(direction.EAST,direction.NORTH,direction.SOUTH,direction.WEST);
  
  
  
  // enum map (on the keys of enum ) 
  // not synchronized 
  //nulls are not permitted 
  
  Map myMap = new EnumMap(direction.class);
  myMap.put(direction.EAST, direction.EAST.getAngle());
  myMap.put(direction.NORTH, direction.NORTH.getAngle());
  myMap.put(direction.SOUTH, direction.SOUTH.getAngle());
  myMap.put(direction.WEST, direction.WEST.getAngle());
  
    Iterator it = myMap.keySet().iterator();
    while(it.hasNext()){
      System.out.println(myMap.get(it.next()));
    }
  
  }
}
