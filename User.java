
public class User {
private String firstName,lastName,phone;
private int age;
private String address ;




public String getFirstName() {
  return firstName;
}

public String getLastName() {
  return lastName;
}

public String getPhone() {
  return phone;
}

public int getAge() {
  return age;
}

public String getAddress() {
  return address;
}

public User(UserBuilder userBuilder){
  this.firstName=userBuilder.firstName;
  this.lastName=userBuilder.lastName;
  this.address=userBuilder.address;
  this.age=userBuilder.age;
  this.phone=userBuilder.phone;
  
  
  
}

public String toString() {
  return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
}

  
  public static class UserBuilder {
    private String firstName,lastName,phone;
    private int age;
    private String address ;
    
    
    public UserBuilder(String firstName, String lastName){
      this.firstName=firstName;
      this.lastName=lastName;
      
    }
    
    
    public UserBuilder phone (String phone ){
      this.phone=phone;
      return this;
    }
    
    
    public UserBuilder address (String address){
      this.address=address;
      return this;
    }
    
    
    public UserBuilder age(int age){
      
      this.age=age;
      return this;
    }
    
    
    
    public User build(){
      
      User user = new User(this);
      return user;
    }
    
    
  }
  
  public static void main(String[] args) {
    
    
    User user1=new User.UserBuilder("navneet", "Pathak").age(20).address("delhi india -110044").build();
    User user2=new User.UserBuilder("nikhil", "gupta").age(30).build();
    System.out.println("user 1 =="+user1);
    System.out.println("user2 =="+user2);
    
  }
}
