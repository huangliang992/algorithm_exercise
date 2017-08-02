package pingduoduo;

import java.util.Scanner;

/* 
 * 大整数乘法 
 */  
public class 大整数相乘 {  
  
    static int N=100;  
    static int a[]=new int[N];  
    static int b[]=new int[N];  
    static int c[]=new int[2*N];  
    static String s1=new String();   
    static String s2=new String();   
      
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
    	Scanner scanner=new Scanner(System.in);  
        s1=scanner.nextLine();
        s2=scanner.nextLine();
        getDigit(s1, a);  
        getDigit(s2, b);  
        multiply(a, b, c);  
        output();  
    }  
      
    public static void output() {  
        int flag=2*N-1;  
        while(c[flag]==0) {  
            if(flag==0) {  
                System.out.println("0");  
                return ;  
            }  
            flag--;  
        }  
        for(int i=flag;i>=0;i--) {  
            System.out.print(c[i]);  
        }  
        System.out.println("");  
    }  
      
    public static void multiply(int a[],int b[],int c[]) {  
        //逐个相乘  
        for(int i=0;i<N;i++) {  
            for(int j=0;j<N;j++) {  
                c[i+j]+=a[i]*b[j];  
            }  
        }  
        //移位、进位  
        for(int i=0;i<2*N-1;i++) {  
            c[i+1]+=c[i]/10;  
            c[i]=c[i]%10;  
        }  
    }  
      
    public static void getDigit(String s,int a[]) {  
        int len=s.length();  
        for(int i=0;i<len;i++) {  
            a[len-1-i]=s.charAt(i)-'0';  
        }  
    }  
} 