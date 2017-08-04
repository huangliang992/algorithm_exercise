package 多线程.生产者消费者.synchronized实现;

public class 测试 {

	public static void main(String args[]){
		苹果 apple = new 苹果();
		apple.setCount(0);
		//一个生产者一个消费者
		消费者  c = new 消费者(apple);
		生产者  b = new 生产者(apple);
		
//		Thread producer = new Thread(b, "生产者");
//		producer.start();
//		Thread consumer = new Thread(c, "消费者");
//		consumer.start();
		
		//多个生产者，多个消费者
		for(int i=0;i<5;i++){
			Thread producer = new Thread(b, "生产者"+i);
			producer.start();
			Thread consumer = new Thread(c, "消费者"+i);
			consumer.start();
		}
		
	}
}
