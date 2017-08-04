package 多线程.生产者消费者.synchronized实现;

public class 消费者 implements Runnable{

	public 苹果 apple;
	
	public  消费者(苹果 apple){
		this.apple = apple;
	}

	@Override
	public void run() {
		//让消费者一直消费
		while(apple.getCount()< 100){
			consume();
		}
	}
	
	public void consume(){
		synchronized(apple){
			if(apple.getCount()>0){
				apple.setCount(apple.getCount()-1);
				System.out.println(Thread.currentThread().getName()
						+"消费了一个苹果-"+"总量"+apple.getCount());
			}else{
				System.out.println(Thread.currentThread().getName()
						+"开始等待"+"总量"+apple.getCount());
				apple.notifyAll();
				try {
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
