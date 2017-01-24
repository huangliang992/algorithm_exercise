package backtrace;

/**
 * 有一堆箱子，每个箱子宽为wi，长为di，高为hi，现在需要将箱子都堆起来，而且为了使堆起来的箱子不到，
 * 上面的箱子的宽度和长度必须小于下面的箱子。请实现一个方法，求出能堆出的最高的高度，这里的高度即堆起
 * 来的所有箱子的高度之和。给定三个int数组w,l,h，分别表示每个箱子宽、长和高，同时给定箱子的数目n。
 * 请返回能堆成的最高的高度。保证n小于等于500。测试样例：[1,1,1],[1,1,1],[1,1,1]返回：1
 * @author hl
 *
 */
public class Box {
	
	private int Max=0;
	
	public int getHeight(int[] w, int[] l, int[] h, int n) {
        // write code here
		int m[]=new int[n];
		get(w,l,h,n,0,0,m);
		return Max;
    }
	
	public void get(int[] w, int[] l, int[] h, int n, int t, int max, int[] m){
		if(t<n){
			for(int i=0;i<n;i++){
				//第t层可以放第i个箱子
				boolean f=judge(t,i,w,l,h,m);
				System.out.println("第"+t+"层第"+i+"箱子"+f);
				if(f){
					max=max+h[i];
					m[t]=i;
					get(w,l,h,n,t+1,max, m);
					max=max-h[i];
				}
			}
			if(max>Max){
				Max=max;
			}
		}
	}
	
	//第t层可以放第i个箱子？
	public boolean judge(int t, int i, int[] w, int[] l, int[] h, int[] m){
		boolean b=true;
		if(t>0){
			if(w[m[t-1]]<=w[i]||l[m[t-1]]<=l[i]){
				b=false;
			}
		}
		return b;
	}
	
	public static void main(String args[]){
		Box b=new Box();
		int w[]={3,4,1};
		int l[]={4,5,1};
		int h[]={4,7,1};
		System.out.print(b.getHeight(w, l, h, 3));
	}
}
