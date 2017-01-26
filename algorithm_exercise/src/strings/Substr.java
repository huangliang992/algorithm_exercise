package strings;

public class Substr {
	public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
		boolean a[]=new boolean[n];
		for(int i=0;i<p.length;i++){
			if(s.contains(p[i])){
				a[i]=true;
			}else{
				a[i]=false;
			}
		}
		return a;
		
    }
	
	public static void main(String args[]){
		Substr s=new Substr();
		String[] p={"a","bcd","c","d"};
		boolean b[]=s.chkSubStr(p, 4, "abc");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
	}
}
