package ���߳�;

import java.util.Date;

public class wait_notify���� implements Runnable{
	
	public Object o = new Object();

	@Override
	public void run() {
		synchronized (o) {
			try {
				System.out.println(Thread.currentThread().getName()+"-"+"��ʼ��������");
				o.notifyAll();
//				o.notify();
				System.out.println("���ѽ���"+"��ʼwait");
				o.wait();
				System.out.println(Thread.currentThread().getName()+"������");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]){
		wait_notify���� thread = new wait_notify����();
		for(int i=0;i<5;i++){
			Thread th = new Thread(thread, "�߳�"+i);
			th.start();
		}
	}
	
}
