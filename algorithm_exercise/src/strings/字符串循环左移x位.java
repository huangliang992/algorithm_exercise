package strings;

public class �ַ���ѭ������xλ {
    public String LeftRotateString(String str,int n) {
        return str.substring(n, str.length()) + str.substring(0, n);
    }
    
    public static void main(String args[]){
    	�ַ���ѭ������xλ a = new �ַ���ѭ������xλ();
    	System.out.println(a.LeftRotateString("abcXYZdef", 3));
    }
    
}
