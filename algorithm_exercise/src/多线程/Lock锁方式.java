package 多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock锁方式  implements Runnable{

	public Lock lock;
	
	public Lock锁方式(Lock lock){
		this.lock = lock;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			lock.lock();
			System.out.println(Thread.currentThread().getName()+"获得了锁");
		}finally{
			System.out.println(Thread.currentThread().getName()+"释放了锁");
			lock.unlock();
		}
	}
	
	public static void main(String args[]){
		Lock lock = new ReentrantLock();
		Lock锁方式 l = new Lock锁方式(lock);
		for(int i=0;i<5;i++){
			Thread th = new Thread(l, "thread"+i);
			th.start();
		}
	}

}
