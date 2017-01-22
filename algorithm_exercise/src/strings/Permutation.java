package strings;

import java.util.ArrayList;

public class Permutation {
	public ArrayList<String> getPermutation(String A) {
        // write code here
		ArrayList<String> list=new ArrayList<String>();
		char[] a=A.toCharArray();
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				char temp=a[i];
				if(a[j]>a[i]){
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int flag[]=new int[A.length()];
		for(int i=0;i<flag.length;i++){
			flag[i]=0;
		}
		String s="";
		gp(a,A.length()-1,list,s,flag);
		String ss[]=new String[list.size()];
		for(int i=0;i<list.size();i++){
			ss[i]=list.get(i);
		}
		for(int i=0;i<ss.length;i++){
			for(int j=i+1;j<ss.length;j++){
				if(isALB(ss[j],ss[i])){
					String t=ss[i];
					ss[i]=ss[j];
					ss[j]=t;
				}
			}
		}
		ArrayList<String> list1=new ArrayList<String>();
		for(int i=0;i<ss.length;i++){
			list1.add(ss[i]);
		}
		return list1;
    }
	
	public void gp(char[] a,int n, ArrayList<String> arr,String s,int flag[]){
		if(n>=0){
			for(int i=0;i<a.length;i++){
				//¼ôÖ¦
				if(flag[i]==0){
					flag[i]=1;
					s=s+a[i];
					gp(a,n-1,arr,s,flag);
					flag[i]=0;
					s=s.substring(0,s.length()-1);
					}
			}
		}else{
			arr.add(s); 
		}
	}
	
	
	public boolean isALB(String a,String b){
		boolean flag=true;
		for(int i=0;i<a.length();i++){
			if(b.charAt(i)>a.charAt(i)){
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String args[]){
		Permutation p=new Permutation();
		ArrayList<String > list=p.getPermutation("EYUIDHFGEW");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}

	}
}
