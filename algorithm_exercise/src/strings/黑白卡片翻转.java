package strings;

import java.util.Scanner;

public class 黑白卡片翻转 {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int min = change(str,0);
		for(int i=1;i<str.length();i++){
			int num = change(str,i);
			if(num<min){
				min=num;
			}
		}
		System.out.println(min);
	}
	
	/**
	 * 以i为中心固定要翻转多少次
	 * @param str
	 * @param i
	 * @return
	 */
	public static int change(String str, int i){
		int total = 0;
		for(int j=i-1; j>=0; j--){
			if((i-j)%2==1){
				if(str.charAt(j)==str.charAt(i)){
					total++;
				}
			}else{
				if(str.charAt(j)!=str.charAt(i)){
					total++;
				}
			}
		}
		for(int j=i+1;j<str.length();j++){
			if((j-i)%2==1){
				if(str.charAt(j)==str.charAt(i)){
					total++;
				}
			}else{
				if(str.charAt(j)!=str.charAt(i)){
					total++;
				}
			}
		}
		return total;
	}

}
