package ���߳�.������������.lockʵ��;

import java.util.concurrent.locks.Lock;

public class ������  implements Runnable{

	public Lock lock;
	
	public volatile ƻ�� apple;
	
	public ������(Lock lock, ƻ�� apple){
		this.lock = lock;
		this.apple = apple;
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			consume();
		}
	}
	
	@SuppressWarnings("finally")
	public void consume(){
		if(apple.getCount()>0){
			try{
				lock.lock();
				System.out.println(Thread.currentThread().getName()+"-����");
				apple.setCount(apple.getCount()-1);
				System.out.println(Thread.currentThread().getName()
						+"����һ��ƻ��-"+"����"+apple.getCount());
			}finally{
				System.out.println(Thread.currentThread().getName()+"-����");
				lock.unlock();
				return;
			}
		}
		System.out.println(Thread.currentThread().getName()+"�����߲���Ҫ��-"+apple.getCount());
	}

}
