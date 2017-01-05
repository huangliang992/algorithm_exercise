package strings;

public class CkeckDifferent {
	public boolean checkDifferent(String iniString) {
        // write code here
		for(int i=0;i<iniString.length();i++){
			for(int j=i+1;j<iniString.length();j++){
				if(iniString.charAt(i)==iniString.charAt(j)){
					return false;
				}
			}
		}
		return true;
    }
	
	public static void main(String args[]){
		CkeckDifferent cd=new CkeckDifferent();
		boolean b=cd.checkDifferent("aeiiu");
		System.out.println(b);
	}
}
