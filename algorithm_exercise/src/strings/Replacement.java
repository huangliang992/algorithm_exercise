package strings;

public class Replacement {
	public String replaceSpace(String iniString, int length) {
        // write code here
		String str="";
		for(int i=0;i<length;i++){
			if(iniString.charAt(i)!=' '){
				str=str+iniString.charAt(i);
			}else{
				str=str+"%20";
			}
		}
		return str;
    }
	public static void main(String args[]){
		Replacement r=new Replacement();
		String s=r.replaceSpace("Mr John Smith", 13);
		System.out.println(s);
	}
}
