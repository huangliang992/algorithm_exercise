package 抽象类和接口;

public abstract class AbstractClass {

	private int a =0;
	
	private void method1(){
		System.out.println("test");
	}
	
	public AbstractClass(){
		method1();
	}
	
	public abstract void method();;
	
	//错误的
//	private abstract void method2();
	
	//最终的方法，不能被子类覆盖
	public final void test(){}
}
