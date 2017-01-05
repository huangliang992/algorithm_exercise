package strings;


public class Zipper {
	public String zipString(String iniString) {
        // write code here
		String iniString1=iniString+" ";
		String str1="";
		for(int i=0;i<iniString1.length();i++){
			for(int j=i+1;j<iniString1.length();j++){
				if(iniString1.charAt(j)!=iniString1.charAt(i)){
					str1=str1+iniString1.charAt(i)+(j-i);
					i=j;
				}
			}
		}
		System.out.println(str1);
		if(str1.length()<iniString.length()){
			return str1;
		}else return iniString;
    }
	
	public static void main(String args[]){
		Zipper z=new Zipper();
		String s=z.zipString("aabcccccaaa");
		System.out.println(s);
	}
}
