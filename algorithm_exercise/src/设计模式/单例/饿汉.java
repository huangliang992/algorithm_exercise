package ���ģʽ.����;

public class ���� {

	private static ���� singleton = new ����();
	
	private ����(){}
	
	public synchronized static ���� getSingleton(){
		
		return singleton;
	}
	
}
