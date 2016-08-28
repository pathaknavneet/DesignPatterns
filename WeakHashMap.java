import java.util.Map;

public class WeakHashMap {

  public static void main(String[] args) throws  InterruptedException{
    Map<Order, Integer> myMap = new java.util.WeakHashMap<>();
    
    myMap.put(new Order("order1","order 1"), 100);
    myMap.put(new Order("order2", "Order 2"),200);
    
    System.out.println(myMap.size());
    
    Thread.sleep(5000);
    Runtime.getRuntime().gc();
    
    System.out.println(myMap.size());
  }
}

class Order {
  
  private String orderId ;
  private String details ;
  
  public Order (String orderId,String details){
    this.orderId=orderId;
    this.details=details;
  }
}
