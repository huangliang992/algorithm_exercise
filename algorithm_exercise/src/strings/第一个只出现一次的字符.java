package strings;

public class ��һ��ֻ����һ�ε��ַ� {
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
		��һ��ֻ����һ�ε��ַ� a = new ��һ��ֻ����һ�ε��ַ�();
		System.out.println(a.FirstNotRepeatingChar("abcadcb"));
	}
}
