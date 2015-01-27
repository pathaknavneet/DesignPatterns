package proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor commandExecutor;
	public  CommandExecutorProxy(String username,String password) {
		
		if(username.equals("navneet") && password.equals("navneet123"))
		{
			isAdmin=true;
		}
		commandExecutor=new CommandExecutorImpl();
	}
	
	@Override
	public void executeCommand() {
		
		if(isAdmin){
			System.out.println("executing command in proxy ");
			commandExecutor.executeCommand();
		}
		else 
		{
			System.out.println("not a admin user , command can not be executed");
		}
		
	}

}
