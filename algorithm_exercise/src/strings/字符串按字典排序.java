package strings;

import java.util.ArrayList;

public class 字符串按字典排序 {
	
	public static void main(String args[]){
		字符串按字典排序 a = new 字符串按字典排序();
		ArrayList<String> list = a.Permutation("aa");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	public ArrayList<String> Permutation(String str) {
	       int[] used = new int[str.length()];
	       for(int i=0;i<used.length;i++){
	    	   used[i] = 0;
	       }
	       ArrayList<String> al = new ArrayList<String>();
	       StringBuilder sb = new StringBuilder();
	       char[] cr = sort(str).toCharArray();
	       backtrace(al,cr, str.length(), used, sb);
	       return al;
    }
	
	/**
	 * 對字符串排序
	 * @param str
	 * @return
	 */
	public String sort(String str){
		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				char temp = c[i];
				if(c[j]<temp){
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<c.length;i++){
			sb.append(c[i]);
		}
		return sb.toString();
	}
	
	public void backtrace(ArrayList<String> list, char[] str, int t, int[] used, StringBuilder sb){
		//这个边界值特别重要
		if(t>0){
			for(int i=0;i<str.length;i++){
				//判斷該字符可否使用
				if(used[i]!=1){//可以使用
					sb.append(str[i]);
					used[i] = 1;
					backtrace(list, str, t-1, used, sb);
					used[i]=0;//将数组中的值改回来，如果是按值的话不用，引用的话就要变回来
					sb.deleteCharAt(sb.length()-1);//同上
				}
			}
		}else{
			//去重
			if(!list.contains(sb.toString())){
				list.add(sb.toString());
			}
		}
	}
}
