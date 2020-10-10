import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import static java.lang.Math.sqrt;; 


interface downloadable
{
	public void download();
	
}
interface Readable extends downloadable
{
	public void readBook();
	
}
abstract class Book implements Readable{
	public void readBook() {
		System.out.println("Read Book");
	}
}

	

class Caller  {

	private  void init() {
		System.out.println("c1");
	}
	private void start()
	{
		init();
		System.out.println("startted");
	}
}
public class TestClass {
	
public static void main(String[] args) {
	
	
	  LocalDateTime date
	  =LocalDateTime.of(2014, 7, 31,1,1);
	  date.plusDays(30);
	  date.plusMonths(1);
	  System.out.println(date.format(DateTimeFormatter.ISO_DATE)); 
		/*
		 * StringBuilder a=new StringBuilder("XXXX"); a.append("here",0,2);
		 * 
		 * int x=100; int a=x++; int b=++x; int c=x++;
		 * System.out.println(x+" "+a+" "+b+" "+c); int d=a<b?a<c?a:b<c?b:c:x;
		 * 
		 * System.out.println(a);
		 * 
		 * List colors=new ArrayList<>(); colors.add("green"); colors.add("red");
		 * colors.add("blue"); colors.add("yellow"); colors.remove(2);
		 * colors.add(3,"cyan"); System.out.println(colors);
		 */ 	 
	/*
	 * String[] strs=new String[2]; strs[0]=new String(); strs[0].concat("sjwhk3");
	 * System.out.println(strs[0]);
	 */
	/*
	 * boolean a=Boolean.valueOf("1"); boolean b=Boolean.valueOf(null);
	 * System.out.println(a+" "+b);
	 */
	  int x=6;
	  while(isAvailable(--x))
	  {
		  System.out.println(x);
	  }
}

static boolean isAvailable(int x)
{
	return --x>0?true:false;
}
}