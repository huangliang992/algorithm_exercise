package ���߳�;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock����ʽ  implements Runnable{

	public Lock lock;
	
	public Lock����ʽ(Lock lock){
		this.lock = lock;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			lock.lock();
			System.out.println(Thread.currentThread().getName()+"�������");
		}finally{
			System.out.println(Thread.currentThread().getName()+"�ͷ�����");
			lock.unlock();
		}
	}
	
	public static void main(String args[]){
		Lock lock = new ReentrantLock();
		Lock����ʽ l = new Lock����ʽ(lock);
		for(int i=0;i<5;i++){
			Thread th = new Thread(l, "thread"+i);
			th.start();
		}
	}

}
