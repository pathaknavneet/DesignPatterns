import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class TestDate {
    private static final String delimiter="|@|";
	 public static void main(String[] args) throws ParseException{
	   String obfuscatedId="abc|$|xyz|$|hjdsjfh";
	   System.out.println("\\|\\$\\|");
	  /* String objectId=obfuscatedId.substring(0,obfuscatedId.indexOf(delimiter)+delimiter.length()+1);
	   System.out.println(objectId);
	   String type=obfuscatedId.substring(obfuscatedId.indexOf(delimiter)+delimiter.length()+1,obfuscatedId);
	   System.out.println(type);*/
	   System.out.println();
	   String [] kkk=obfuscatedId.split("\\|\\$\\|");
	   System.out.println(kkk[2]);
	   String endDate="2016-11-07-04-30";
	   String[] endDateTimeInterval = endDate.split("-");
	   final Calendar endCalendar = new GregorianCalendar(Integer.parseInt(endDateTimeInterval[0]),
	          Integer.parseInt(endDateTimeInterval[1]), Integer.parseInt(endDateTimeInterval[2]),
	          Integer.parseInt(endDateTimeInterval[3]), Integer.parseInt(endDateTimeInterval[4]));
	     
	   System.out.println(endCalendar.getTime());
	       }
	 
	}

