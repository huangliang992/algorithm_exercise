package ���ģʽ.����;

public class ���� {
	
	private static ���� singleton;

	private ����(){}
	
	public synchronized static ���� getSingleton(){
		if(singleton == null){
			singleton = new ����();
		}
		return singleton;
	}
	
	
}
