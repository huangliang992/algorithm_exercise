package ���߳�.������������.synchronizedʵ��;

public class ������ implements Runnable{

	public ƻ�� apple;
	
	public  ������(ƻ�� apple){
		this.apple = apple;
	}

	@Override
	public void run() {
		//��������һֱ����
		while(apple.getCount()< 100){
			consume();
		}
	}
	
	public void consume(){
		synchronized(apple){
			if(apple.getCount()>0){
				apple.setCount(apple.getCount()-1);
				System.out.println(Thread.currentThread().getName()
						+"������һ��ƻ��-"+"����"+apple.getCount());
			}else{
				System.out.println(Thread.currentThread().getName()
						+"��ʼ�ȴ�"+"����"+apple.getCount());
				apple.notifyAll();
				try {
					apple.wait();
					System.out.println(Thread.currentThread().getName()
							+"�ȴ�����"+"����"+apple.getCount());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
