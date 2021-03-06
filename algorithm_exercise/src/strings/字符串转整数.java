package strings;

import java.util.Stack;

public class 字符串转整数 {
	
	public static void main(String args[]){
		字符串转整数 a = new 字符串转整数();
		System.out.println(a.StrToInt("+2147483647"));
	}
	
	public final char[] oper={'+','-','*','/','%'};
    public int StrToInt(String str) {
    	Stack<Integer> s = new Stack<Integer>();
    	char oper = '+';
        for(int i=0;i<str.length();i++){
        	if((str.charAt(i)-'0'>=0 && str.charAt(i)- '9' <=0)||isOperator(str.charAt(i))){
        		if(str.charAt(i) == '-'){
        			oper = '-';
        		}
        		if(!isOperator(str.charAt(i))){
        			s.push(str.charAt(i)-'0');
        		}
        	}else{
        		return 0;
        	}
        }
        int i =0;
        int total = 0;
        if(oper == '-'){
        	 while(!s.isEmpty()){
             	total = (int) (total - Math.pow(10, i)*s.pop());
             	i++;
             }
        }else{
        	while(!s.isEmpty()){
             	total = (int) (total + Math.pow(10, i)*s.pop());
             	i++;
             }
        }
        return total;
    }
    
    /**
     * 判断a是否是操作符
     * @param a
     */
    public boolean isOperator(char a){
    	for(int i=0;i<oper.length;i++){
    		if(a==oper[i]){
    			return true;
    		}
    	}
    	return false;
    }
}
