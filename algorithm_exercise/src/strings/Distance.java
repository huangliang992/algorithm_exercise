package strings;

import java.util.ArrayList;

public class Distance {
	public int getDistance(String[] article, int n, String x, String y) {
	     // write code here
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(article[i].equals(x)){
				a.add(i);
			}
			if(article[i].equals(y)){
				b.add(i);
			}
		}
		//找a,b中两个最接近的数
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<a.size();i++){
			for(int j=0;j<b.size();j++){
				int d=Math.abs(a.get(i)-b.get(j));
				c.add(d);
			}
		}
		//找c中最小的值
		int min=c.get(0);
		for(int i=0;i<c.size();i++){
			if(c.get(i)<min){
				min=c.get(i);
				}
		}
		return min;
	}
}
