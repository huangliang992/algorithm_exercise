package stack;

import java.util.ArrayList;
import java.util.List;
/**
 * �мҶ���������ֻ����è�͹��������������������������������������ʽ����һ��Ϊֱ���������ж�������������������ģ�
 * �ڶ���Ϊѡ�������Ķ������ͣ�è�򹷣������������ֶ�������������������ġ�
       ����һ����������int[][2] ope(C++��Ϊvector<vector<int>>)���������¼�������һ��Ԫ��Ϊ1��
       ������ж���������������ڶ���Ԫ��Ϊ����ı�ţ�������������������è������һ��Ԫ��Ϊ2������������������
       �ڶ���Ԫ����Ϊ0�����ȡ��һ��������ʽ����Ϊ1����ָ������������Ϊ-1��ָ������è���밴˳�򷵻����������С�
       �����ֲ��Ϸ��Ĳ�������û�п��Է�������Ҫ��Ķ������������������ԡ�
����������
[[1,1],[1,-1],[2,0],[2,-1]]
���أ�[1,-1]
 * @author hl
 *
 */
public class CatDogAsylum {
	public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
		List<Integer> l=new ArrayList<Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<ope.length;i++){
			if(ope[i][0]==1){
				l.add(ope[i][1]);
			}
			if(ope[i][0]==2){
				if(ope[i][1]==0){
					for(int j=0;j<l.size();j++){
						list.add(l.get(j));
						l.remove(j);
						break;
					}
				}else if(ope[i][1]>0){
					for(int j=0;j<l.size();j++){
						if(l.get(j)>0){
							list.add(l.get(j));
							l.remove(j);
							break;
						}
					}
				}else if(ope[i][1]<0){
					for(int j=0;j<l.size();j++){
						if(l.get(j)<0){
							list.add(l.get(j));
							l.remove(j);
							break;
						}
					}
				}
			}
		}
		return list;
		}
		
	public static void main(String args[]){
		CatDogAsylum c=new CatDogAsylum();
		int a[][]={{1,-5},{1,-1},{1,9},{1,9},{2,0},{2,1},{1,-8},{2,1},{1,-71},{1,-92},{1,18},{1,91},{1,61},{2,-1},{1,-35},{1,95},{1,-49},{1,9},{1,78},{2,0},{1,91},
};
		ArrayList<Integer> arr=c.asylum(a);
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
	}
}
