package com.comp228_lesson13;

public class MyThread extends Thread {
// private instance variable
	private String _name;
	MyThread(String name){
		this._name = name;
	}
	@Override
	public void run() {
for(int index=0;index<10;index++){
	System.out.println("Thread" +this._name + "count: "+ index);
	try{
		
		sleep(1000); // wait for 1000
	}catch(InterruptedException exception){
		System.err.println("Thread interrupted: "+ exception);
	}
}

		super.run();
	}

	
}
