package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static boolean resolve(int[] A) {
    	int[] a=new int[3];
    	boolean f=false;
    	for(int i=1;i<A.length-1;i++){
    		int sum1=0;
    		a[0]=i;
    		for(int j=i+2;j<A.length-1;j++){
    			int sum2=0;
    			a[1]=j;
    			for(int k=j+2;j<A.length-1;j++){
    				int sum3=0;
    				int sum4=0;
    				a[2]=k;
    				for(int m=0;m<a[0];m++){
    		    		sum1=sum1+A[m];
    		    	}
    		    	for(int m=a[0];m<a[1];m++){
    		    		sum2=sum2+A[m];
    		    	}
    		    	for(int m=a[1];m<a[2];m++){
    		    		sum3=sum3+A[m];
    		    	}
    		    	for(int m=a[2];m<A.length;m++){
    		    		sum4=sum4+A[m];
    		    	}
    		    	if(sum1==sum2&&sum1==sum3&&sum1==sum4){
    		    		f=true;
    		    	}
    			}
    		}
    	}
    	return f;
    }

    public static void main(String[] args){
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        while(line != null && !line.isEmpty()) {
            int value = Integer.parseInt(line.trim());
            if(value == 0) break;
            inputs.add(value);
            line = in.nextLine();
        }
        int[] A = new int[inputs.size()];
        for(int i=0; i<inputs.size(); i++) {
            A[i] = inputs.get(i).intValue();
        }
        Boolean res = resolve(A);

        System.out.println(String.valueOf(res));
    }
}