package 多线程.生产者消费者.lock实现;

import java.util.concurrent.locks.Lock;

public class 生产者  implements Runnable{

	public Lock lock;
	
	public volatile 苹果  apple;
	
	public 生产者(Lock lock, 苹果 apple){
		this.lock = lock;
		this.apple = apple;
	}
	
	@Override
	public void run() {
		//一直生产
		for(int i=0; i<100;i++){
			produce();
		}
	}
	
	@SuppressWarnings("finally")
	public void produce(){
		if(apple.getCount()<10){
			try{
				lock.lock();
				System.out.println(Thread.currentThread().getName()+"-枷锁");
				apple.setCount(apple.getCount()+1);
				System.out.println(Thread.currentThread().getName()
						+"生产了一个苹果-"+"总量"+apple.getCount());
			}finally{
				System.out.println(Thread.currentThread().getName()+"-解锁");
				lock.unlock();
				return;
			}
		}
		System.out.println(Thread.currentThread().getName()+"生产者不需要锁-"+apple.getCount());
	}

}
