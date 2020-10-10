import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class A {
	void test()
	{
		System.out.println("A");
	}

}

class B extends A {
	void test()
	{
		System.out.println("B");
	}

}

class C extends B{
	void test(Integer x, Integer y) {
		System.out.println("Integer");
	}

	void test(int x, int y) {
		System.out.println("int x");
	}

	public void test() {
		System.out.println("C");
	}
}

// Main Class 
public class Inherit {
	int x = 10;
	
	char c;
	boolean b;
	float f;
	public static void main(String[] args) {
		int ans;
		/*
		 * C b1=new C(); A b2=b1;
		 * 
		 * //b1.test(10,20);
		 * 
		 * ArrayList<Integer> points=new ArrayList<>(); points.add(1); points.add(2);
		 * points.add(3); points.add(4); points.add(null); points.remove(1);
		 * points.remove(null); System.out.println(points);
		 * 
		 * int ivar=100; float fvar=100.100f; double dvar=123; fvar=ivar;
		 * 
		 * int idx=0; int size=3; do { idx++; } while(idx<size-1);
		 * System.out.println(idx);
		 */
		/*
		 * String[] strs= {"A","B"}; int idx=0; for(String s:strs) {
		 * strs[idx].concat("element "+idx);
		 * 
		 * } for(idx=0;idx<strs.length;idx++) { System.out.println(strs[idx]); }
		 */
		/*
		 * Inherit in=new Inherit(); System.out.println(in.c+" "+in.b+""+in.f);
		 */	
		/*
		 * A b1=new A(); A b2=new C(); A b3=(B)b2; b1=(A)b2; b1.test(); b3.test();
		 */
		/*
		 * try { int num=10; int div=0; ans=num/div; } catch(ArithmeticException ae) {
		 * ans=0; } catch(Exception e) { System.out.println("Invalid calculations"); }
		 * System.out.println("Answer= "+ans);
		 */
		
		List<String> lst=Arrays.asList("A","B","C","D");
		Iterator<String> itr=lst.iterator();
		while(itr.hasNext())
		{
			String e=itr.next();
			if(e=="C")
			{
				break;
			}
			else
			{
				//continue;
				System.out.println(e);
			}
		}
	}
}
