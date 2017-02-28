package test;

public class ByValueOrByRef {
	private void byvalue(int a){
		a=1;
	}
	
	private void byref(int[] a){
		a[0]=1;
	}
	
	public static void main(String args[]){
		ByValueOrByRef b=new ByValueOrByRef();
		int a=2;
		int[] c={0};
		b.byvalue(a);//按值传递
		b.byref(c);//按引用传递
		System.out.println(a+" "+c[0]);
	}
}
