package strings;

import java.util.HashMap;
import java.util.Map;

public class Same {
	public boolean checkSam(String stringA, String stringB) {
        // write code here
		
		boolean flag=true;
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<stringA.length();i++){
			if(!map.containsKey(""+stringA.charAt(i))){
				map.put(""+stringA.charAt(i), 1);
			}else{
				map.put(""+stringA.charAt(i), map.get(""+stringA.charAt(i))+1);
			};
		}
		for(int i=0;i<stringB.length();i++){
			if(map.containsKey(""+stringB.charAt(i))){
				map.put(""+stringB.charAt(i), map.get(""+stringB.charAt(i))-1);
			}else{
				return false;
			}
		}
		for(Map.Entry<String, Integer>entry:map.entrySet()){
			int value=entry.getValue();
			if(value!=0){
				return false;
			}
		}
		return flag;
    }
	
	public static void main(String args[]){
		Same s=new Same();
		boolean b=s.checkSam("Here you are", "Are you here");
		System.out.println(b);
		boolean c=s.checkSam("This is nowcoder", "is This nowcoder");
		System.out.println(c);
		
	}
}
