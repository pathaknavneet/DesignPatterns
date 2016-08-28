import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Producer1  implements Runnable{

  
  // execution of task
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName()+"Started");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
  
}
public class ExecutorsTest {
public static void main(String[] args) {
  
  ExecutorService service = Executors.newFixedThreadPool(3);
  
  // Define the task 
  Producer1 pr1=new Producer1();
  
  // submit the task to the thread pool 
  service.submit(pr1);
  service.submit(pr1);
  service.submit(pr1);
  
  
  
  
}
}
