package arries;

public class CrossLine {
	public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        // write code here
		if(s1!=s2){
			return true;
		}else if(y1==y2){
			return true;
		}else return false;
    }
}
