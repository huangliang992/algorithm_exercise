package strings;

import java.util.Stack;

public class ToString {
	public String toString(int x) {
        // write code here
		String a[]={"","Thousand","Million","Billion"};
		Stack<String> stack=new Stack<String>();
		int temp=x;
		int k=0;
		while(temp!=0){
			int t=temp%1000;
			if(t!=0){
				stack.push(inside1000(t)+a[k]+",");
			}
			k++;
			temp=temp/1000;
		}
		String s="";
		while(!stack.isEmpty()){
			s=s+stack.pop();
		}
		int l=0;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)!=','&&s.charAt(i)!=' '){
				l=i;
				break;
			}
		}
		return s.substring(0, l+1).trim();
    }
	
	public String inside1000(int x){
		String s1[]={"","One","Two","Three","Four","Five","Six","Seven","Eight",
					"Nine"};
		String s2[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen",
					"Seventeen","Eighteen","Nineteen"};
		String s3[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty",
					"Ninety"};
		String s="";
		int a=x/100;//°Ù
		int b=(x-a*100)/10;//Ê®
		int c=x-a*100-b*10;//¸ö
		if(a!=0){
			for(int i=1;i<s1.length;i++){
				if(a==i){
					s=s+s1[i]+" Hundred ";
				}
			}
		}
		if(b!=0&&b!=1){
			for(int i=2;i<s3.length;i++){
				if(b==i){
					s=s+s3[i]+" ";
				}
			}
			for(int i=0;i<s1.length;i++){
				if(c==i){
					s=s+s1[i]+" ";
				}
			}
		}else if(b==1){
			for(int i=0;i<s2.length;i++){
				if(c==i){
					s=s+s2[i]+" ";
				}
			}
		}else{
			for(int i=0;i<s1.length;i++){
				if(c==i){
					s=s+s1[i]+" ";
				}
			}
		}
		return s;
	}
	
	public static void main(String args[]){
		ToString t=new ToString();
		System.out.println(t.inside1000(18));
		System.out.println(t.toString(1));
	}
}
