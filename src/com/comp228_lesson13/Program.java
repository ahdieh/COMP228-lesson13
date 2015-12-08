package com.comp228_lesson13;

public class Program {

	
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("1");
		MyThread thread2 = new MyThread("2");
		
		thread1.start();//start secondary thread
		thread2.start();//start secondary thread
		
		// stert 1our main operation
		for(int index=0; index<10;index++){
			System.out.println("Thread count: "+ index);
			try{
				
				Thread.sleep(1000); // wait for 1000 ms = 1sec
			}catch(InterruptedException exception){
				System.err.println("Main interrupted: "+ exception);
			}
		}

	}

}
