package pingduoduo;

import java.util.ArrayList;
import java.util.Scanner;

//public class 最大乘积 {
//	public static void main(String args[]){
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int a[] = new int[n];
//		for(int i=0;i<n;i++){
//			a[i] = s.nextInt();
//		}
//		int max1=0, max2=0, max3=0;//正数
//		int flag1 = -1, flag2 = -1,flag3 = -1;//负数
//		int x1 = -10000, x2 = -10000, x3 =-10000, x4 =-10000, x5=-10000, x6 = -10000;
//
//		//找出最大六个数
//		for(int i=0;i<n;i++){
//			if(a[i] > x1){
//				x6 = x5;
//				x5 = x4;
//				x4 = x3;
//				x3 = x2;
//				x2 = x1;
//				x1 = a[i];
//			}else if(a[i] > x2){
//				x6 = x5;
//				x5 = x4;
//				x4 = x3;
//				x3 = x2;
//				x2 = a[i];
//			}else if(a[i] > x3){
//				x6 = x5;
//				x5 = x4;
//				x4 = x3;
//				x3 = a[i];
//			}
//			else if(a[i] > x4){
//				x6 = x5;
//				x5 = x4;
//				x4 = a[i];
//			}
//			else if(a[i] > x5){
//				x6 = x5;
//				x5 = a[i];
//			}
//			else if(a[i] > x6){
//				x6 = a[i];
//			}
//			//三个最大正数
//			if(a[i]>0){
//				if(a[i] > max1){
//					max3 = max2;
//					max2 = max1;
//					max1 = a[i];
//				}else if(a[i] > max2){
//					max3 = max2;
//					max2 = a[i];
//				}else if(a[i] > max3){
//					max3 = a[i];
//				}
//			}
//			//找出三个最小负的
//			if(a[i]<0){
//				if(a[i] < flag1){
//					flag3 = flag2;
//					flag2 = flag1;
//					flag1 = a[i];
//				}else if(a[i] < flag2){
//					flag3 = flag2;
//					flag2 = a[i];
//				}else if(a[i] < flag3){
//					flag3 = a[i];
//				}
//			}
//		}
//		int num1 = max1*max2*max3;
//		int num2 = max1*flag1*flag2;
//		int num3 = x1 * x2 * x3;
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		
//		int max = 0;
//		if(num1>num2){
//			max = num1;
//		}else{
//			max = num2;
//		}
//		if(num3>max){
//			max = num3;
//		}
//		System.out.println(max);
//	}
//	
//	
//}



public class 最大乘积 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		int c1=0,c2=0,c3=0;
		for(int i=0;i<n;i++){
			if(a[i]>0){
				c1++;
			}
			if(a[i]==0){
				c2++;
			}
			if(a[i]<0){
				c3++;
			}
		}
		if(c1==0){
			int max1=-10000,max2=-10000,max3=-1000;//正数
			for(int i=0;i<n;i++){
				if(a[i] > max1){
					max3 = max2;
					max2 = max1;
					max1 = a[i];
				}else if(a[i] > max2){
					max3 = max2;
					max2 = a[i];
				}else if(a[i] > max3){
					max3 = a[i];
				}
			}
			System.out.println(max1*max2*max3);
		}else {
			int max1=0,max2=0,max3=0;//正数
			int flag1 = -1, flag2 = -1,flag3 = -1;//负数
			//找出三个最大的正的
			for(int i=0;i<n;i++){
				if(a[i]>0){
					if(a[i] > max1){
						max3 = max2;
						max2 = max1;
						max1 = a[i];
					}else if(a[i] > max2){
						max3 = max2;
						max2 = a[i];
					}else if(a[i] > max3){
						max3 = a[i];
					}
				}
				//找出三个最小负的
				if(a[i]<0){
					if(a[i] < flag1){
						flag3 = flag2;
						flag2 = flag1;
						flag1 = a[i];
					}else if(a[i] < flag2){
						flag3 = flag2;
						flag2 = a[i];
					}else if(a[i] < flag3){
						flag3 = a[i];
					}
				}
			}
			
			int num1 = max1*max2*max3;
			int num2 = max1*flag1*flag2;
			int max = 0;
			if(num1>num2){
				max = num1;
			}else{
				max = num2;
			}
			System.out.println(max);
		}
		
	}
	
	
}
