package proxy;

public class ProxyTest {

	public static void main(String[] args) {
		
		
		CommandExecutor commandExecutor=new CommandExecutorProxy("navneet", "navnee");
		commandExecutor.executeCommand();

	}

}
