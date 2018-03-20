package com.scp.iteration;

/**
 * @author Amit
 * 
 * return with value must have one return stmt which executes for sure 
 * implicit type casting is done before return executes (auto boxing and un boxing as well)
 * can't return void if method returning type is void--->Void methods cannot return a value
 * can return same or child of object mentioned in method's returning type  
 */
public class BreakReturnExample {

	public void m1() {
		System.out.println(" in m1 ");
		// return void;
		return ;
	}
	
	public byte m2() {
		
		/*int i=12;
		double d=12.5;
		char ch='a';*/
		byte b=4;
	//	short s=12;
		
		
		System.out.println(" in m2 ");
		return b;
	
	}
	
	
	public Object m3() {
		
		System.out.println(" in m3 ");
		return new Object();
			}
	
	
	public Integer m4() {
		System.out.print(" in m4 ");
		int x=10;
		if(x==12)
		return new Integer(67);
		else
		return x;
	}
		
	public static void main(String[] args) {
		 
		BreakReturnExample bre= new BreakReturnExample();	
		bre.m1();
		System.out.println(bre.m2());
		System.out.println(bre.m3());
		System.out.print(bre.m4());
		
		
		
		
	}

}
