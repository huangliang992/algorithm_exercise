package 多线程;

import java.util.Date;

public class Synchronized方法  implements Runnable{
	
	//volatitle关键子作用
	public static volatile int count = 0;

	
	/**
	 * 同步方法，synchronized 只会锁定调用run()方法的那个Synchronized方对象,
	 * 加在run方法上thread2要等thread1执行完才能执行
	 */
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			if(Thread.currentThread().getName().equals("thread1")){
				getA();
			}else{
				getB();
			}
			
		}
	}
	
	public synchronized void getA(){
		System.out.println("获取thread1-"  + new Date().getTime());
	}
	
	
	public synchronized void getB(){
		System.out.println("获取thread2-" + new Date().getTime());
	}
	
	public static void main(String args[]){
		Synchronized方法 thread1 = new Synchronized方法();
		Synchronized方法 thread2 = new Synchronized方法();
		Thread t1 = new Thread(thread1, "thread1");
		Thread t2 = new Thread(thread1, "thread2");//同一个对象，这样才会互斥
//		Thread t3 = new Thread(thread2, "thread3");//这样是不会互斥的
		t1.start();
		t2.start();
//		t3.start();
	}

}
