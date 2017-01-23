package backtrace;

import java.util.ArrayList;

public class Queens {
	
	private int number=0;
	
	public int nQueens(int n) {
        // write code here
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=0;
		}
		count(n,a,0);
		return number;
    }
	
	public void count(int n, int a[], int t){
		if(t<n){
			for(int i=0;i<n;i++){
				//如果第t层i列能放皇后
				boolean temp=judge(a,t,i);
				//System.out.println("第"+t+"层"+"第"+i+"列"+temp);
				if(temp){
					a[t]=i;
					if(a[0]==5&&a[1]==2&&a[2]==0&&a[3]==6
							&&a[4]==4&&a[5]==7){System.out.println("yes");}
					count(n,a,t+1);
					a[t]=0;
				}
			}
		}else{
			
			number++;
			System.out.println(number);
		}
	}
	
	public boolean judge(int a[], int n, int k){//a[i]是第i行放的第几列
		boolean flag=true;
		if(n>0){
			for(int i=0;i<n;i++){
				double d= (double) (k-a[i])/(n-i);
				if(a[i]==k||d==1||d==-1){
					System.out.println(i+" "+a[i]);
					flag=false;
					break;
				}
			}
		}
		return flag;
	}
	
	public static void main(String args[]){
		Queens q=new Queens();
		System.out.print(q.nQueens(11));
		int a[]={5,2,0,6,4,0,0,0};
		System.out.println(q.judge(a, 5, 7));
	}
}
