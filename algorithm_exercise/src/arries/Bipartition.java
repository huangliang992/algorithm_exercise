package arries;

public class Bipartition {
	//水均益
	//两个正方形中心的连线
	public double[] getBipartition(Point[] A, Point[] B) {
        // write code here
		//坐标不一定按顺时针，逆时针
		//哎
		Point [] A1=byShunshi(A);
		Point [] B1=byShunshi(B);
		double x1=(double) (A1[3].x-A1[0].x)/2+A1[0].x;
		double x2=(double) (B1[3].x-B1[0].x)/2+B1[0].x;
		double y1=(double) (A1[1].y-A1[0].y)/2+A1[0].y;
		double y2=(double) (B1[1].y-B1[0].y)/2+B1[0].y;
		double k=(y2-y1)/(x2-x1);
		double l=y1-k*x1;
		double a[]={k,l};
		return a;
    }
	
	public Point [] byShunshi(Point [] a){
		Point [] result=new Point [4];
		Point temp=a[0];
		for(int i=0;i<4;i++){
			if(a[i].x<temp.x){
				temp=a[i];
			}
		}
		result[0]=temp;
		for(int i=0;i<4;i++){
			if(a[i].x==temp.x&&a[i].y!=temp.y){
				result[1]=a[i];
			}else
			if(a[i].x!=temp.x&&a[i].y==temp.y){
				result[3]=a[i];
			}else{
				result[2]=a[i];
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		Bipartition c=new Bipartition();
		Point a1=new Point();
		a1.x=136;
		a1.y=6278;
		Point a2=new Point();
		a2.x=3958;
		a2.y=6278;
		Point a3=new Point();
		a3.x=3958;
		a3.y=2456;
		Point a4=new Point();
		a4.x=136;
		a4.y=2456;
		
		Point b1=new Point();
		b1.x=-3898;
		b1.y=11132;
		Point b2=new Point();
		b2.x=7238;
		b2.y=11132;
		Point b3=new Point();
		b3.x=7238;
		b3.y=-4;
		Point b4=new Point();
		b4.x=-3898;
		b4.y=-4;
		Point [] a={a1,a2,a3,a4};
		Point [] b={b1,b2,b3,b4};
		System.out.println(c.getBipartition(a, b)[0]);
	}
}
