package arries;

public class Ants {
	public double antsCollision(int n) {
        // write code here
		double d=1-2/Math.pow(2, n);
		return d;
    }
	public static void main(String args[]){
		Ants a=new Ants();
		System.out.println(a.antsCollision(13));
	}
}
