package ���߳�;

/**
 * �����������߳�(thread1��thread2)����ͬһ������(syncThread)�е�synchronized�����ʱ��
 * ��ͬһʱ��ֻ����һ���̵߳õ�ִ�У���һ���߳�������������ȴ���ǰ�߳�ִ�������������Ժ����ִ�иô���顣
 * Thread1��thread2�ǻ���ģ���Ϊ��ִ��synchronized�����ʱ��������ǰ�Ķ���ֻ��ִ����ô��������ͷŸö�������
 * ��һ���̲߳���ִ�в������ö���
 * 
 * @author hl
 *
 */
public class Synchronized����� implements Runnable {

	private static int count;

	public Synchronized�����() {
		count = 0;
	}

	public void run() {
		// ͬ�������
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println(Thread.currentThread().getName() + ":" + (count++));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public int getCount() {
		return count;
	}

	/**
	 * Ϊʲôthread1��thread2�������У� ��Ϊ�����Ǵ����
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Synchronized����� thread1 = new Synchronized�����();
		Synchronized����� thread2 = new Synchronized�����();
		Thread t1 = new Thread(thread1, "thread1");
		Thread t2 = new Thread(thread1, "thread2");
		t1.start();
		t2.start();
	}
}
