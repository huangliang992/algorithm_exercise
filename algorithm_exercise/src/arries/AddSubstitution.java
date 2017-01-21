package arries;

public class AddSubstitution {
	public int calc(int a, int b, int type) {
        // write code here
		int result=0;
		if(type==1){
			for(int i=0;i<a;i++){
				result=result+b;
			}
		}else if(type==0){
			int temp=b;
			while(temp<a){
				result++;
				temp=temp+b;
			}
		}else if(type==-1){
			if(a>=b){
				while(b!=a){
					b++;
					result++;
				}
			}else {
				while(b!=a){
					a++;
					result=result+(-1);
				}
			}
		}
		return result;
    }
	
	public static void main(String args[]){
		AddSubstitution a=new AddSubstitution();
		System.out.println(a.calc(5, 15, -1));
	}
}
