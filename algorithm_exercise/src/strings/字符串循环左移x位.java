package strings;

public class ×Ö·û´®Ñ­»·×óÒÆxÎ» {
    public String LeftRotateString(String str,int n) {
        return str.substring(n, str.length()) + str.substring(0, n);
    }
    
    public static void main(String args[]){
    	×Ö·û´®Ñ­»·×óÒÆxÎ» a = new ×Ö·û´®Ñ­»·×óÒÆxÎ»();
    	System.out.println(a.LeftRotateString("abcXYZdef", 3));
    }
    
}
