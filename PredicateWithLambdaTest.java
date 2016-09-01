import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Emp {
  
  private String name ;
  private int age;
  private int empId ;
  private String gender ;
  
  
  public Emp(){
    
  }
  
  public Emp(String name , int age , int empId,String gender){
    this.name=name;
    this.age=age;
    this.empId=empId;
    this.gender=gender;
    
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getEmpId() {
    return empId;
  }

  public String getGender() {
    return gender;
  }
  
  
  @Override
  public String toString() {
   
    return getName()+ ":"+getAge()+":"+getEmpId()+":"+getGender();
  }
  
  
}
public class PredicateWithLambdaTest {

  public static Predicate<Emp> isAduleMale(){
    return e-> e.getAge()>21 && e.getGender().equals("Male");
  }
  public static Predicate<Emp> isAduleFemale(){
    return e-> e.getAge()>21 && e.getGender().equals("Female");
  }
  
  public static Predicate<Emp> isAgeMoreThan(Integer age) {
    return p -> p.getAge() > age;
}
  public static List<Emp> filterEmployees (List<Emp> employees, Predicate<Emp> predicate) {
    return employees.stream().filter( predicate ).collect(Collectors.<Emp>toList());
}
  
  public static void main(String[] args) {
    
    
    Emp emp1= new Emp("navneet",22, 1, "Male");
    
    
    Emp emp2= new Emp("Nikhil",18, 1, "Male");
    
    
    Emp emp3= new Emp("Priti",22, 1, "Female");
    
    
    Emp emp4= new Emp("Ani",22, 1, "Female");
    
    
    List<Emp> empList= new ArrayList<>();
    empList.addAll(Arrays.asList(emp1,emp2,emp3,emp4));
    
    System.out.println(filterEmployees(empList, isAduleFemale()));
    
    
  }
  
  
  
}
