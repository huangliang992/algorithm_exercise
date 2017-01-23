package strings;

import java.util.Stack;

public class Parenthesis {
	public boolean chkParenthesis(String A, int n) {
        // write code here
		Stack<Character> s=new Stack<Character>();
		boolean flag=true;
		for(int i=0;i<n;i++){
			//System.out.println(A.charAt(i));
			if(A.charAt(i)!='('&&A.charAt(i)!=')'){
				return false;
			}else if(A.charAt(i)=='('){
				s.push('(');
			}else{
				if(s.isEmpty()){
					flag=false;
				}else{
					s.pop();
				}
			}
		}
		if(!s.isEmpty()){
			flag=false;
		}
		return flag;
    }
	
	public static void main(String args[]){
		Parenthesis p=new Parenthesis();
		System.out.println(p.chkParenthesis("(()())", 6));
		System.out.println(p.chkParenthesis("())()()(((d", 11));
		System.out.println(p.chkParenthesis("()(()()", 7));
	}
}
