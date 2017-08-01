package arries;

import java.util.ArrayList;
import java.util.Scanner;

public class –Ú¡–Ωªªª {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++){
			int temp = a[i];
			for(int j=i+1;j<n;j++){
				a[i] = a[j];
				a[j] = temp;
				String st = changtoString(a);
				if(!list.contains(st)){
					list.add(st);
				}
				a[j] = a[i];
				a[i] = temp;
			}
		}
		System.out.println(list.size());
	}
	
	public static String changtoString(int a[]){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length;i++){
			sb.append(a[i]);
		}
		return sb.toString();
	}
}
