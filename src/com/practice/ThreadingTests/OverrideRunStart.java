package com.practice.ThreadingTests;

public class OverrideRunStart extends Thread{

	@Override
	public void run() {
		//super.run();
		System.out.println("in run mtd"+"\n aaammss".equals(Thread.currentThread().getName()));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("in start mtd");

	}
}
