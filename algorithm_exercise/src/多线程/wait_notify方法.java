package 多线程;

import java.util.Date;

public class wait_notify方法 implements Runnable{
	
	public Object o = new Object();

	@Override
	public void run() {
		synchronized (o) {
			try {
				System.out.println(Thread.currentThread().getName()+"-"+"开始唤醒其他");
				o.notifyAll();
//				o.notify();
				System.out.println("唤醒结束"+"开始wait");
				o.wait();
				System.out.println(Thread.currentThread().getName()+"被唤醒");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]){
		wait_notify方法 thread = new wait_notify方法();
		for(int i=0;i<5;i++){
			Thread th = new Thread(thread, "线程"+i);
			th.start();
		}
	}
	
}
