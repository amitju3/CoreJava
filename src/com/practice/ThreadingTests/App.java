package com.practice.ThreadingTests;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	OverrideRunStart ttc1=new OverrideRunStart();
    	ttc1.setName("aaammss");
    	ttc1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println( "Hello World!" );
    }
}
