package utils;

public class ������� {
	
	public static int total = 0;
	
	public static void main(String args[]){
		int [] a = {1,2,3,4,5,6};
		int [] b = new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i] = -1;
		}
		selectMFromN(a, 2, 0, b);
		System.out.println(total);
	}

	/**
	 * ��a������ѡȡm��C(a.length,m) (1,6)(6,1)������
	 * @param a
	 * @param m
	 * @param t �� 0��ʼ
	 * @select ѡ��������±�
	 */
	public static void selectMFromN(int[] a, int m, int t, int[] select){
		if(t<m){
			for(int i=0;i<a.length;i++){
				boolean f = judge(select, t, i);//�ж�a�е�i�����Ƿ�ѡ��
				if(!f){
					select[t] = i;
					selectMFromN(a, m, t+1, select);
					select[t] = -1;
				}
			}
		}else{
			total++;
			//select�о���ѡ���һ������
			for(int i=0;i<m;i++){
				System.out.print(a[select[i]] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * �ж�select������t֮ǰ�Ƿ���ֹ�����k
	 * @param select
	 * @param t
	 * @param k
	 * @return
	 */
	public static boolean judge(int[] select, int t, int k){
		for(int i=0;i<t;i++){
			if(select[i] == k){
				return true;
			}
		}
		return false;
	}
}
