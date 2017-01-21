package arries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DenseLine {
	public double[] getLine(Point[] p, int n) {
        // write code here
		Map<Double, ArrayList<Point>> map=new HashMap<Double,ArrayList<Point>>();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				double k=(double) (p[i].y-p[j].y)/(p[i].x-p[j].x);
				System.out.println("斜率是"+k);
				if(!map.containsKey(k)){
					ArrayList<Point> l=new ArrayList<Point>();
					l.add(p[i]);
					l.add(p[j]);
					map.put(k, l);
				}else{
					ArrayList<Point> l=map.get(k);
					if(!l.contains(p[i])){
						l.add(p[i]);
					}
					if(!l.contains(p[j])){
						l.add(p[j]);
					}
				}
			}
		}
		double temp=0;
		int num=0;
		for(Map.Entry<Double, ArrayList<Point>>entry:map.entrySet()){
			double key=entry.getKey();
			System.out.println("map中的斜率是"+key);
			ArrayList<Point> value=entry.getValue();
			if(value.size()>num){
				num=value.size();
				temp=key;
			}
		}
		ArrayList<Point> arr=map.get(temp);
		Point p1=arr.get(0);
		double l=p1.y-temp*p1.x;
		double result[]={temp,l};
		return result;
    }
	
	public static void main(String args[]){
		DenseLine d=new DenseLine();
		Point a1=new Point();
		a1.x=0;
		a1.y=0;
		Point a2=new Point();
		a2.x=1;
		a2.y=1;
		Point a3=new Point();
		a3.x=2;
		a3.y=2;
		Point a4=new Point();
		a4.x=3;
		a4.y=2;
		Point a5=new Point();
		a5.x=7;
		a5.y=8;
		Point []p={a1,a2,a3,a4,a5};
		double a[]=d.getLine(p, 5);
		System.out.println(a[0]+" "+a[1]);
	}
}
