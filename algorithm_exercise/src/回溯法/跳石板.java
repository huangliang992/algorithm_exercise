package 回溯法;

import java.util.ArrayList;
import java.util.Scanner;

public class 跳石板 {

	private static int total;
	
	private static ArrayList<Integer> list1 = new ArrayList<Integer>();
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		total = m;
		count(n, m, 0);
		System.out.println(total+1);
	}
	
	public static void count(int n, int m, int num){
		if(m>n){
			ArrayList<Integer> list = getYueshu(n);
			for(int i=0;i<list.size();i++){
				if(num<total){
					count(n + list.get(i), m, num++);
				}
			}
		}else{
			if(m==n && num < total){
				total = num;
			}
		}
	}
	
	/**
     * 获取n的所有的约数
     * @param n
     * @return
     */
    public static ArrayList<Integer> getYueshu(int n){
    	list1.clear();
    	for(int i=n-1;i>=2;i--){
    		if(n%i==0){
    			list1.add(i);
    		}
    	}
    	return list1;
    }
}
