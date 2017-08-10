package arries;

import java.util.Scanner;

public class ¼ÆËãÌÇ¹û {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		int k1 = 0;
		int k2 = 0;
		int k3 = 0;
		
		if((a+c)%2==0){
			k1 = (a+c)/2;
			k3 = k1 - (a+b);
		}else{
			System.out.println("NO");
			return;
		}
		if((c-a)%2==0){
			k2 = (c-a)/2;
		}else{
			System.out.println("NO");
			return;
		}
		
		if(k2+k3==d){
			System.out.println(k1+" "+k2+" "+k3);
		}else{
			System.out.println("NO");
		}
		
	}
}
