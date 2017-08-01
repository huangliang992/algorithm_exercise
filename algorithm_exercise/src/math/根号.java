package math;

public class 根号 {

	public static void main(String args[]){
		int a = 9;
		int b = (int) Math.sqrt(a);
		int c = sqrtInt(a);
		System.out.println(c);
	}
	
	/**
	 * 整数开根号
	 * @param a
	 * @return
	 */
	public static int sqrtInt(int a){
		int result = 1;
		for(int i=1; i< a/2; i++){
			if(i*i<=a){
				result = i;
			}else{
				break;
			}
		}
		return result;
	}
}
