package ���߳�;

import java.util.Date;

public class Synchronized����  implements Runnable{
	
	//volatitle�ؼ�������
	public static volatile int count = 0;

	
	/**
	 * ͬ��������synchronized ֻ����������run()�������Ǹ�Synchronized������,
	 * ����run������thread2Ҫ��thread1ִ�������ִ��
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
		System.out.println("��ȡthread1-"  + new Date().getTime());
	}
	
	
	public synchronized void getB(){
		System.out.println("��ȡthread2-" + new Date().getTime());
	}
	
	public static void main(String args[]){
		Synchronized���� thread1 = new Synchronized����();
		Synchronized���� thread2 = new Synchronized����();
		Thread t1 = new Thread(thread1, "thread1");
		Thread t2 = new Thread(thread1, "thread2");//ͬһ�����������Żụ��
//		Thread t3 = new Thread(thread2, "thread3");//�����ǲ��ụ���
		t1.start();
		t2.start();
//		t3.start();
	}

}
