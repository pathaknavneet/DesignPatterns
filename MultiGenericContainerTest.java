
class MultiGenericContainer <T,S>{
  
  T firstPosition;
  S secondPosition;
  
  public MultiGenericContainer(T firstPosition, S secondPosition){
    this.firstPosition=firstPosition;
    this.secondPosition=secondPosition;
    
  }

  public T getFirstPosition() {
    return firstPosition;
  }

  public void setFirstPosition(T firstPosition) {
    this.firstPosition = firstPosition;
  }

  public S getSecondPosition() {
    return secondPosition;
  }

  public void setSecondPosition(S secondPosition) {
    this.secondPosition = secondPosition;
  }
  
  
  
  
}

public class MultiGenericContainerTest {
  public static void main(String[] args) {
  
    MultiGenericContainer<String,String> container1 = new MultiGenericContainer<>("firstString","secondString");
    
    String firstPositionStr= container1.getFirstPosition();
    System.out.println(firstPositionStr);
}
}
