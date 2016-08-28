import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
  
  private CyclicBarrier barrier;
  
  public Task(CyclicBarrier barrier){
    this.barrier=barrier;
  }

  @Override
  public void run() {
    System.out.println("Thread- "+ Thread.currentThread().getName()+" :Started");
    try {
      System.out.println("Thread"+Thread.currentThread().getName()+" is waiting on the barrier");
      barrier.await();
      System.out.println("Thread"+Thread.currentThread().getName()+" has crossed the barrier");
      
    } catch (InterruptedException | BrokenBarrierException e) {
      e.printStackTrace();
    }
    
  }
  
}

public class CyclicBarrierTest {

  public static void main(String[] args) {
    
    CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
      
      @Override
      public void run() {
        System.out.println("Action applied after all thread has reached the barrier");
        
      }
    });
      
    
    ExecutorService executor = Executors.newFixedThreadPool(3);
    
    for (int i =0; i< 3;i++){
      executor.submit(new Task(barrier));
    }
    
    executor.shutdown();

    
    
  }
}
