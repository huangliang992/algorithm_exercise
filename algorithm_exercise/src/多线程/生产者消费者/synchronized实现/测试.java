package ���߳�.������������.synchronizedʵ��;

public class ���� {

	public static void main(String args[]){
		ƻ�� apple = new ƻ��();
		apple.setCount(0);
		//һ��������һ��������
		������  c = new ������(apple);
		������  b = new ������(apple);
		
//		Thread producer = new Thread(b, "������");
//		producer.start();
//		Thread consumer = new Thread(c, "������");
//		consumer.start();
		
		//��������ߣ����������
		for(int i=0;i<5;i++){
			Thread producer = new Thread(b, "������"+i);
			producer.start();
			Thread consumer = new Thread(c, "������"+i);
			consumer.start();
		}
		
	}
}
