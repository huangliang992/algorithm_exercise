package backtrace;

/**
 * ��һ�����ӣ�ÿ�����ӿ�Ϊwi����Ϊdi����Ϊhi��������Ҫ�����Ӷ�������������Ϊ��ʹ�����������Ӳ�����
 * ��������ӵĿ�Ⱥͳ��ȱ���С����������ӡ���ʵ��һ������������ܶѳ�����ߵĸ߶ȣ�����ĸ߶ȼ�����
 * �����������ӵĸ߶�֮�͡���������int����w,l,h���ֱ��ʾÿ�����ӿ����͸ߣ�ͬʱ�������ӵ���Ŀn��
 * �뷵���ܶѳɵ���ߵĸ߶ȡ���֤nС�ڵ���500������������[1,1,1],[1,1,1],[1,1,1]���أ�1
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
				//��t����Էŵ�i������
				boolean f=judge(t,i,w,l,h,m);
				System.out.println("��"+t+"���"+i+"����"+f);
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
	
	//��t����Էŵ�i�����ӣ�
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
