package com.tns.thread;


public class CreatingThreadFrist extends Thread{
	public void run(){
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThreadFrist ob =new CreatingThreadFrist();
		ob.start();

	}

}