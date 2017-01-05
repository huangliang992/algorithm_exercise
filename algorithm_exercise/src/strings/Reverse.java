package strings;

public class Reverse {
	 public String reverseString(String iniString) {
	        // write code here
		 String s="";
		 for(int i=iniString.length()-1;i>=0;i--){
			 s=s+iniString.charAt(i);
		 }
		 return s;
	    }
	 
	 public static void main(String args[]){
		 Reverse r=new Reverse();
		 String str=r.reverseString("This is nowcoder");
		 System.out.println(str);
	 }
}
