
class GenericContainer<T>{
  private T object ;

  public T getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }
}
public class GenericTest {

  public static void main(String[] args) {
    
    GenericContainer<Integer> intContainer = new GenericContainer<>();
    intContainer.setObject(3);
    System.out.println(intContainer.getObject());
    
    GenericContainer<String> strContainer = new GenericContainer<>();
    strContainer.setObject("navneet");
    System.out.println(strContainer.getObject());
    
  }
  
}
