package com.comp228_lesson13;

public class MyRunnable implements Runnable {

	// private instance variable
		private String _name;
	public MyRunnable(String name) {
		this._name = name;
	}

	@Override
	public void run() {

		_Task1();

		
}

	private  synchronized void _Task1() {
		for(int index=0;index<10;index++){
			System.out.println("Runnable" +this._name + ": "+ index);
			try{
				
				Thread.sleep(1000); // wait for 1000
			}catch(InterruptedException exception){
				System.err.println("Thread interrupted: "+ exception);
			}
	}
	}
}
