package utils;

public class 排列组合 {
	
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
	 * 从a集合中选取m个C(a.length,m) (1,6)(6,1)区分了
	 * @param a
	 * @param m
	 * @param t 从 0开始
	 * @select 选择的数的下标
	 */
	public static void selectMFromN(int[] a, int m, int t, int[] select){
		if(t<m){
			for(int i=0;i<a.length;i++){
				boolean f = judge(select, t, i);//判断a中第i个数是否被选过
				if(!f){
					select[t] = i;
					selectMFromN(a, m, t+1, select);
					select[t] = -1;
				}
			}
		}else{
			total++;
			//select中就是选择的一个排序
			for(int i=0;i<m;i++){
				System.out.print(a[select[i]] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 判断select数组在t之前是否出现过数字k
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
