import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class Task2 implements Runnable {

   Semaphore semaphore = new Semaphore(1);
  @Override
  public void run() {
    
      try {
        this.mutualExclusion();
        
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    
  }
  
  private void mutualExclusion () throws InterruptedException{
   
    semaphore.acquire();
    System.out.println(Thread.currentThread().getName() + " inside mutual exclusive region");
    
    try{
      Thread.sleep(3000);
    }
    finally {
      semaphore.release();
      System.out.println(Thread.currentThread().getName() + " outside mutual exclusive region");
    }
  }
  
}
public class CountingSemaphoreTest {

  
  public static void main(String[] args) {
    
    Task2 task2 = new Task2();
    ExecutorService service = Executors.newFixedThreadPool(2);
    for(int i=0;i<2;i++){
      service.submit(task2);
    }
    
    service.shutdown();
    
  }
  
}
