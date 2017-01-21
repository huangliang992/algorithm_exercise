package arries;

import java.util.ArrayList;

public class Render {
	public int[] renderPixel(int[] screen, int x, int y) {
        // write code here
		int a[]=new int [screen.length*8];
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<screen.length;i++){
			ArrayList<Integer> ar=toBin(screen[i]);
			for(int j=0;j<8;j++){
				if(j<ar.size()){
					arr.add(ar.get(j));
				}else{
					arr.add(0);
				}
			}
			
		}
		for(int i=0;i<a.length;i++){
			if(i>=x&&i<=y){
				a[i]=1;
			}else{
				a[i]=arr.get(i);
			}
		}
		for(int i=0;i<screen.length;i++){
			int temp=0;
			for(int j=i*8;j<i*8+8;j++){
				//System.out.print(a[j]);
				temp=(int) (temp+a[j]*Math.pow(2, j%8));
			}
			screen[i]=temp;
		}
		return screen;
    }
	
	public ArrayList<Integer> toBin(int n){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		if(n==0){
			arr.add(0);
		}
		else{
			while(n!=0){
				arr.add(n%2);
				n=n/2;
			}
		}
		return arr;//8---0001
	}
	
	public static void main(String args[]){
		Render r=new Render();
		int a[]={58,211,111,90,248,124,27,226,39,43,124,183,182,141,133,12,233,227,27,103,216,14,187,200,22,115,28,50,132,174,173,105,203,231,134,21,129,46,108,241,196};
		int b[]=r.renderPixel(a, 194, 313);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
