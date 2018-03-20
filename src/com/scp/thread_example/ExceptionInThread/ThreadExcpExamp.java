package com.scp.thread_example.ExceptionInThread;

public class ThreadExcpExamp implements Runnable {

	volatile boolean flag = false;
	volatile int count=0;

	public void run() {
		// TODO Auto-generated method stub
		/**
		 * to stop thread 
		 * 1. create an exception --> run() can't throws exception to called method --> i.e. only try-catch block is used to handle the exception in run() 
		 * 2. use volatile boolean variable flag and write run() code in a loop
		 * with flag
		 * 3. create a method kill() or override stop() to change value of flag var
		 */

		while (!flag) {
			System.out.println("in run mtd"+count++);
			System.out.println("in run mtd"+count++);

			/*
			 * int x=2; if(x==2) throw new ArithmeticException();
			 */

			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println("in run mtd"+count++);
			System.out.println("in run mtd"+count++);

		}
	}
	public void stop()
	{
	flag=true;
	}

}
