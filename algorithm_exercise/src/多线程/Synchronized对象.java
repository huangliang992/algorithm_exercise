package 多线程;

import java.util.Date;

public class Synchronized对象 implements Runnable{

	public Persion p;
	
	public static int count;
	
	public Synchronized对象(Persion p){
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
					"-修改了" + p.getName() + "-" + new Date().getTime());
		}
	}
	
	public void method2(){
		System.out.println(Thread.currentThread().getName() + "-获取了" + p.getName() + "-" + new Date().getTime());
	}
	
	public static void main(String args[]){
		Persion p = new Persion();
		p.setName("张三");
		Synchronized对象 thread = new Synchronized对象(p);
		for(int i=0;i<5;i++){
			Thread t = new Thread(thread, "thread"+i);
			t.start();
		}
	}

	
}
