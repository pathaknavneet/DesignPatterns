class GenericNumberContainer<T extends Number >{
  
  T object ;
  
  public GenericNumberContainer() {

  }
  
  GenericNumberContainer(T object){
    this.object=object;
  }

  public T getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }
  
  public static <N extends Number > double add( N a , N b ){
   double firstValue = a.doubleValue();
   double secondValue = b.doubleValue();
   double result = firstValue+secondValue;
   return result;
  }
  
  
}
public class GenericNumberContainerTest {
public static void main(String[] args) {
  GenericNumberContainer<Integer> genericNumberContainer= new GenericNumberContainer<>();
  genericNumberContainer.setObject(3);
  System.out.println(genericNumberContainer.getObject());
  GenericNumberContainer<Double> genericNumberContainer2= new GenericNumberContainer<>();
  genericNumberContainer2.setObject(20.0);
  System.out.println(genericNumberContainer2.getObject());
  
  
  System.out.println(GenericNumberContainer.add(5.0, 7.0));
  
  
  
  
}
  
}
