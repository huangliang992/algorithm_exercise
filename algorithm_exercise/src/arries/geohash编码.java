package arries;

import java.util.Scanner;

/**
 * geohash���룺geohash�����ڽ���ά�ľ�γ��ת��Ϊ�ַ�������Ϊ��������һ���Ǿ�γ�ȵĶ����Ʊ��룬�ڶ�����base32ת�롣
���⿼��γ�ȵĶ����Ʊ��룺�㷨��γ��[-90, 90]ͨ�����ַ��������ޱƽ���ȡ�������辫�ȣ����⾫��Ϊ6����ע�⣬������ж��ַ��ƽ�������ֻ��������ȡ�������ж��֣���Զ����м�ֵ���������䡣�㷨�������£� ���γ��Ϊ80���ж����Ʊ�����̣�
1) ����[-90, 90]���ж���Ϊ[-90, 0),[0, 90]����Ϊ�������䣬����ȷ��80Ϊ�����䣬���Ϊ1��
2) �����һ����������[0, 90]���ж���Ϊ[0, 45),[45, 90]������ȷ��80�������䣬���Ϊ1��
3) ���[45, 90]���ж���Ϊ[45, 67),[67,90],����ȷ��80Ϊ�����䣬���Ϊ1��
4) ���[67,90]���ж���Ϊ[67, 78),[78,90]������ȷ��80Ϊ�����䣬���Ϊ1��
5) ���[78, 90]���ж���Ϊ[78, 84),[84, 90]������ȷ��80Ϊ�����䣬���Ϊ0��
6) ���[78, 84)���ж���Ϊ[78, 81), [81, 84)������ȷ��80Ϊ�����䣬���Ϊ0��
 * @author hl
 *
 */
public class geohash���� {
	
	public static String str = "";

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		back(n, -90, 90, 6);
		for(int i=str.length(); i<6;i++){
			str = str + '0';
		}
		System.out.println(str);
	}
	
	public static void back(int n, int low, int high, int t){
		if(t>0){
			int mid = (low + high)/2;
			if(n>mid){
				str = str + '1';
				back(n, mid, high, t-1);
				
			}else if(n<mid){
				str = str + '0';
				back(n, low, mid, t-1);
				
			}else{
				str = str + '1';
			}
		}else{
			
		}
		
	}
}
