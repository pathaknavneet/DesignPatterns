import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Producer implements Callable<String>{

  private CountDownLatch latch;
  
   public Producer(CountDownLatch latch) {
    this.latch=latch;
  }
  @Override
  public String call() {
    String result="";
    System.out.println("Thread started."+Thread.currentThread().getName());
    try {
       result=Thread.currentThread().getName()+"Hello";
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
    }
    
    latch.countDown();
    return result;
    
    
  }
  
}

public class CountDownLatchTest {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    
    StringBuffer buffer= new StringBuffer();
    CountDownLatch latch = new CountDownLatch(3);
    Future<String> result=null;
    ExecutorService executors= Executors.newFixedThreadPool(3);
    for(int i=0;i<3;i++){
      result= executors.submit(new Producer(latch));
      buffer.append(result.get()+"\t");
    }
    try{
      latch.await();
    }catch(InterruptedException ex){
      ex.printStackTrace();
    }
    
    System.out.println("Processing Main Function after the processing is done \t"+buffer);
    executors.shutdown();
  }
}
