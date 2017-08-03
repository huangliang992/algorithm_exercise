package ���߳�;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ���Զ��̻߳����¶�Hashtable�Ĳ���
 * @author hl
 *
 */
public class Hashtable���Թ��� implements Runnable{

	public static Hashtable ht = new Hashtable();
	
	static{
		ht.put("thread", 0);
	}

	@Override
	public void run() {
		//�߳�1�߳�2ͬʱд���ɶ���
		if(Thread.currentThread().getName().equals("thread1")){
			System.out.println("�߳�1��ʼд " + ht.get("thread"));
			ht.put("thread", 1);
			System.out.println("�߳�1д���� " + ht.get("thread"));
		}else{
			System.out.println("�߳�2��ʼд " + ht.get("thread"));
			ht.put("thread", 2);
			System.out.println("�߳�2д���� " + ht.get("thread"));
		}
	}
	
	public static void main(String args[]){
		Hashtable���Թ��� thread1 = new Hashtable���Թ���();
		Hashtable���Թ��� thread2 = new Hashtable���Թ���();
		Thread t1 = new Thread(thread1, "thread1");
		Thread t2 = new Thread(thread2, "thread2");
		t1.start();
		t2.start();
		
		Object o = new Object();
		ConcurrentHashMap cp = new ConcurrentHashMap();
	}
	
}
