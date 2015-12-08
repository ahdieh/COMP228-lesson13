package com.comp228_lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program {

	
	public static void main(String[] args) {
		MyRunnable myRunnable1 = new MyRunnable("1");
		MyRunnable myRunnable2 = new MyRunnable("2");
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.execute(myRunnable1);
		executor.execute(myRunnable2);
		
		// start 1our main operation
		for(int index=0; index<10;index++){
			System.out.println("Main count: "+ index);
			try{
				
				Thread.sleep(1000); // wait for 1000 ms = 1sec
				if(index>5){
					
				}
				
			}catch(InterruptedException exception){
				System.err.println("Main interrupted: "+ exception);
			}
		}

	}

}
