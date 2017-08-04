package 多线程.生产者消费者.lock实现;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class 测试 {

	public static void main(String args[]){
		苹果 apple = new 苹果();
		apple.setCount(0);
		Lock lock = new ReentrantLock(false);
		生产者   producer = new 生产者(lock, apple);
		消费者   concummer = new 消费者(lock, apple);
		for(int i=0;i<5;i++){
			Thread thread = new Thread(producer, "生产者"+i);
			Thread thread1 = new Thread(concummer, "消费者"+i);
			thread.start();
			thread1.start();
		}
	}
}
