package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ʵ��һ�����ݽṹSetOfStacks���ɶ��ջ��ɣ�����ÿ��ջ�Ĵ�СΪsize����ǰһ��ջ����ʱ���½�һ��ջ��
 * �����ݽṹӦ֧������ͨջ��ͬ��push��pop����������һ����������int[][2] ope(C++Ϊvector<vector<int>>)��
 * ÿ�������ĵ�һ��������������ͣ���Ϊ1����Ϊpush��������һ����ΪӦpush�����֣���Ϊ2����Ϊpop��������һ���������塣
 * �뷵��һ��int[][](C++Ϊvector<vector<int>>)��Ϊ������в������SetOfStacks
��˳��ӦΪ���µ��ϣ�Ĭ�ϳ�ʼ��SetOfStacksΪ�ա���֤���ݺϷ���
 * @author hl
 *
 */
public class SetOfStacks {
	public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		List<Integer> tl=new ArrayList<Integer>();
		for(int i=0;i<ope.length;i++){
			if(ope[i][0]==1){
				tl.add(ope[i][1]);
			}else{
				tl.remove(tl.size()-1);
			}
		}
		//�����list���stake
		for(int i=0;i<tl.size();i++){
			if(i%size==0){
				
				if(i+size<tl.size()){
					List<Integer> l=new ArrayList<Integer>();
					for(int j=i;j<i+size;j++){
						l.add(tl.get(j));
					}
					list.add((ArrayList<Integer>) l);
				}else{
					List<Integer> l=new ArrayList<Integer>();
					for(int j=i;j<tl.size();j++){
						l.add(tl.get(j));
					}
					list.add((ArrayList<Integer>) l);
				}
				
			}
		}
		
		return list;
		
    }
}
