package strings;

public class ReverseEqual {
	 public boolean checkReverseEqual(String s1, String s2) {
	        // write code here
		 	boolean flag=false;
		 	if(s1.length()!=s2.length()){
		 		return flag;
		 	}
		 	int tag=0;
		 	for(int i=0;i<s2.length();i++){
		 		if(!s1.contains(s2.substring(0, i))){
		 			tag=i;
		 			break;
		 		}
		 	}
		 	//System.out.println(tag+s2.substring(tag-1));
		 	if(s1.contains(s2.substring(tag-1))){
		 		flag=true;
		 	}
		 	return flag;
	    }
	 public static void main(String args[]){
		 ReverseEqual re=new ReverseEqual();
		 boolean b=re.checkReverseEqual("waterbottle","erbottlewat");
		 System.out.println(b);
	 }
}
