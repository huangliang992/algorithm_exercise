package ���߳�;

import java.util.Date;

public class Synchronized���� implements Runnable{

	public Persion p;
	
	public static int count;
	
	public Synchronized����(Persion p){
		this.p = p;
		count = 0;
	}
	
	@Override
	public void run() {
		method1();
		method2();
		
	}
	
	public void method1(){
		synchronized(p){
			System.out.println(Thread.currentThread().getName() + 
					"-�޸���" + p.getName() + "-" + new Date().getTime());
		}
	}
	
	public void method2(){
		System.out.println(Thread.currentThread().getName() + "-��ȡ��" + p.getName() + "-" + new Date().getTime());
	}
	
	public static void main(String args[]){
		Persion p = new Persion();
		p.setName("����");
		Synchronized���� thread = new Synchronized����(p);
		for(int i=0;i<5;i++){
			Thread t = new Thread(thread, "thread"+i);
			t.start();
		}
	}

	
}
