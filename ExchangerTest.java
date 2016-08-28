import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task3 implements Runnable{

  
  private Exchanger<String> exchanger =null;
  private String object =null;
  
  public Task3(Exchanger<String> exchanger, String s){
    this.exchanger=exchanger;
    this.object=s;
  }
  
  
  @Override
  public void run() {
  
    String previous = this.object;
    try {
      this.object=this.exchanger.exchange(this.object);
      
      System.out.println(
          Thread.currentThread().getName() +
          " exchanged " + previous + " for " + this.object);
    } catch (InterruptedException e) {
     
      e.printStackTrace();
    }
    
  }
  
  
}
public class ExchangerTest {

  public static void main(String[] args) {
    
    Exchanger<String> exchanger = new Exchanger<>();
    
    Task3 task1=new Task3(exchanger,"Hello");
    Task3 task2=new Task3(exchanger,"Hi");
    
    ExecutorService executor = Executors.newFixedThreadPool(2);
    executor.submit(task1);
    executor.submit(task2);
    
    executor.shutdown();
    
    
  }
}
