package recrusion;

public class ���θ��� {
	
	public int RectCover(int target) {
        int total = 0;
        if(target==0){
        	return 0;
        }else{
	        for(int i=0; i<=target; i++){
	            if(i%2==0){
	                if(i==0){
	                    total = total +1;
	                }else if(target-i>i/2){
	                    total = total + chooseMFromN((target-i+1), i/2);
	                }else if(target-i<=i/2){
	                	total = total + chooseMFromN(i/2+1, target-i);
	                }
	            }
	        }
	        return total;
        }
    }
    
    public int chooseMFromN(int n, int m){
        int a1=1;
        for(int i=0; i<m;i++){
            a1 = a1 * n;
            n--;
        }
        int a2= 1;
        for(int i=m; i>0;i--){
            a2=a2*m;
            m--;
        }
        return a1/a2;
    }
    
    public static void main(String args[]){
    	���θ��� a = new ���θ���();
    	System.out.println(a.RectCover(6));
    	System.out.println(a.chooseMFromN(4,1));
    }
}
