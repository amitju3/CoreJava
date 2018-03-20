package com.scp.thread_example.ExceptionInThread;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws InterruptedException
    {
    	ThreadExcpExamp  tt=new ThreadExcpExamp();
    	Thread ttc1=new Thread(tt);
    	ttc1.setName("aaammss");
    	ttc1.start();
    	Thread.sleep(1);
	//	ttc1.flag=true;
    	ttc1.stop();
    	System.out.println( "Hello Main!" );
    }
}
