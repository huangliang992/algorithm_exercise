package 设计模式.单例;

public class 懒汉 {
	
	private static 懒汉 singleton;

	private 懒汉(){}
	
	public synchronized static 懒汉 getSingleton(){
		if(singleton == null){
			singleton = new 懒汉();
		}
		return singleton;
	}
	
	
}
