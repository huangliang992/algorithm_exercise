package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，当前一个栈填满时，新建一个栈。
 * 该数据结构应支持与普通栈相同的push和pop操作。给定一个操作序列int[][2] ope(C++为vector<vector<int>>)，
 * 每个操作的第一个数代表操作类型，若为1，则为push操作，后一个数为应push的数字；若为2，则为pop操作，后一个数无意义。
 * 请返回一个int[][](C++为vector<vector<int>>)，为完成所有操作后的SetOfStacks
，顺序应为从下到上，默认初始的SetOfStacks为空。保证数据合法。
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
		//将大的list拆成stake
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
