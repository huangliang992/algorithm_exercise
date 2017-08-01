package utils;

public class 异或运算 {
	
	/**
	 * 二进制a异或b
	 * @param a
	 * @param b
	 * @return
	 */
	public static String yihuo(String a, String b){
		String temp = "";
		StringBuilder sb = new StringBuilder();
		if(a.length()>b.length()){
			temp = b;
			for(int i=0;i<a.length()-b.length(); i++){
				temp = '0' + temp;
			}
			for(int i=0;i<temp.length();i++){
				if(a.charAt(i)==temp.charAt(i)){
					sb.append('0');
				}else{
					sb.append('1');
				}
			}
		}else if(b.length()>a.length()){
			temp = a;
			for(int i=0;i<b.length()-a.length(); i++){
				temp = '0' + temp;
			}
			for(int i=0;i<temp.length();i++){
				if(temp.charAt(i)==b.charAt(i)){
					sb.append('0');
				}else{
					sb.append('1');
				}
			}
		}else{
			for(int i=0;i<a.length();i++){
				if(a.charAt(i)==b.charAt(i)){
					sb.append('0');
				}else{
					sb.append('1');
				}
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[]){
		System.out.println(yihuo("11101","000110011"));
	}
}
