package stack;

public class ChangArr {
	public static void main(String args[]){
		String str="[1,-5],[1,-1],[1,9],[1,9],[2,0],[2,1],[1,-8],[2,1],[1,-71],[1,-92],[1,18],[1,91],[1,61],[2,-1],[1,-35],[1,95],[1,-49],[1,9],[1,78],[2,0],[1,91],";
		String str1="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='['){
				str1=str1+"{";
			}else if(str.charAt(i)==']'){
				str1=str1+"}";
			}else{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
	}
}
