package 多线程;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 测试多线程环境下对Hashtable的操作
 * @author hl
 *
 */
public class Hashtable测试工厂 implements Runnable{

	public static Hashtable ht = new Hashtable();
	
	static{
		ht.put("thread", 0);
	}

	@Override
	public void run() {
		//线程1线程2同时写会出啥情况
		if(Thread.currentThread().getName().equals("thread1")){
			System.out.println("线程1开始写 " + ht.get("thread"));
			ht.put("thread", 1);
			System.out.println("线程1写结束 " + ht.get("thread"));
		}else{
			System.out.println("线程2开始写 " + ht.get("thread"));
			ht.put("thread", 2);
			System.out.println("线程2写结束 " + ht.get("thread"));
		}
	}
	
	public static void main(String args[]){
		Hashtable测试工厂 thread1 = new Hashtable测试工厂();
		Hashtable测试工厂 thread2 = new Hashtable测试工厂();
		Thread t1 = new Thread(thread1, "thread1");
		Thread t2 = new Thread(thread2, "thread2");
		t1.start();
		t2.start();
		
		Object o = new Object();
		ConcurrentHashMap cp = new ConcurrentHashMap();
	}
	
}
