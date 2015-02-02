package prototype;

public abstract class Shape implements Cloneable {

	private String id ;
	protected  String type;
	
	
	
	
	abstract void draw();
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object clone =null;
		try{
		    
			clone=(Shape) super.clone();
			
		}catch(CloneNotSupportedException cle){
			cle.printStackTrace();
		}
		return clone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
