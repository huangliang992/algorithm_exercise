package ����;

import java.util.Scanner;

public class �ֵ����� {
	
	public static final char[] c = new char[25];
	
	public static int total = 0;
	
	static{
		for(int i=0;i<25;i++){
			if(i==0){
				c[i] = 'a';
			}else{
				c[i] = (char) (c[i-1] + 1);
			}
		}
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		StringBuilder sb = new StringBuilder();
		search(sb, str, 0);
	}
	
	public static void search(StringBuilder sb, String str, int t){
		if(t<4){
			for(int i=0;i<25; i++){
				sb.append(c[i]);
				total++;
				if(sb.toString().equals(str)){
					System.out.println(total-1);//�ҵ������ֱ�ӷ��ز�������
				}
				search(sb, str, t+1);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}
}
