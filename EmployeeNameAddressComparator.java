import java.util.Comparator;

public class EmployeeNameAddressComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    String name1 = (String )o1.getName();
    String name2 =(String) o2.getName();
    int nameComp = name1.compareTo(name2);
    if(nameComp!=0){
      return nameComp;
    }
    else{
        return o1.getAddress().compareTo(o2.getAddress());
    }
  }

}
