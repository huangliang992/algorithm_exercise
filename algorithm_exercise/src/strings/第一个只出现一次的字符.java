package strings;

public class 第一个只出现一次的字符 {
	public int FirstNotRepeatingChar(String str) {
		for(int i=0;i<str.length();i++){
			boolean flag = true;
			for(int j=0;j<str.length();j++){
				if(str.charAt(j)==str.charAt(i)&& i!=j){
					flag = false;
					break;
				}
			}
			if(flag == true){
				return i+1;
			}
		}
        return 0;
    }
	
	public static void main(String args[]){
		第一个只出现一次的字符 a = new 第一个只出现一次的字符();
		System.out.println(a.FirstNotRepeatingChar("abcadcb"));
	}
}
