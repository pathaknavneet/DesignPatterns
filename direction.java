import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum direction {
  
  SOUTH(0){
     public void displayAngle(){
       System.out.println("Angle is "+ getAngle());
     }
  },NORTH(90){
    public void displayAngle(){
      System.out.println("Angle is "+getAngle());
    }
  },EAST(180){
    public void displayAngle(){
      System.out.println("Angle is "+ getAngle());
    }
  },WEST(270){
    public void displayAngle(){
      System.out.println("Angle is "+getAngle());
    }
    
    
  };
  
  private int angle ;
  
  private direction(int angle ){
    this.angle=angle;
  }
  
  
  public int getAngle(){
    return angle;
  }
  
  private static final Map lookup = new HashMap<>();
  
  static {
    for(direction dir: EnumSet.allOf(direction.class)){
      lookup.put(dir.getAngle(),dir);
    }
  }
  
  public static direction get(int angle){
    return (direction)lookup.get(angle);
  }
  

  public abstract void displayAngle();
  
}
