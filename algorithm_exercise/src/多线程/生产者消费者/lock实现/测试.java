package ���߳�.������������.lockʵ��;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ���� {

	public static void main(String args[]){
		ƻ�� apple = new ƻ��();
		apple.setCount(0);
		Lock lock = new ReentrantLock(false);
		������   producer = new ������(lock, apple);
		������   concummer = new ������(lock, apple);
		for(int i=0;i<5;i++){
			Thread thread = new Thread(producer, "������"+i);
			Thread thread1 = new Thread(concummer, "������"+i);
			thread.start();
			thread1.start();
		}
	}
}
