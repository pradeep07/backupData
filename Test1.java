package com.multithreading;

public class Test1 extends Thread{

	/**
	 * @param args
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("main");
			System.out.println("ThraedName:"+Thread.currentThread());
			System.out.println("i="+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		t1.start();
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println("ThraedName:"+Thread.currentThread());
			System.out.println("i="+i);
		}

	}

}
/*class MyThread extends Thread{
	
}*/
