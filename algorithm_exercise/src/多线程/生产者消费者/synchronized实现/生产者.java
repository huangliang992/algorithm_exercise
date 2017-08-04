package 多线程.生产者消费者.synchronized实现;

public class 生产者 implements Runnable{

	public 苹果 apple;
	
	public 生产者(苹果 apple){
		this.apple = apple;
	}

	@Override
	public void run() {
		//让生产者一直生产
		while(apple.getCount()<100){
			produce();
		}
	}
	
	public void produce(){
		synchronized(apple){
			if(apple.getCount() <10 ){
				apple.setCount(apple.getCount()+1);
				System.out.println(Thread.currentThread().getName()
						+"生产了一个苹果-"+"总量"+apple.getCount());
			}else{
				try {
					System.out.println(Thread.currentThread().getName()
						+"开始等待"+"总量"+apple.getCount());
					apple.notifyAll();
					apple.wait();
					System.out.println(Thread.currentThread().getName()
							+"等待结束"+"总量"+apple.getCount());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
