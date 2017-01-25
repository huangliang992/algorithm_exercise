package strings;

public class Frequency {
	public int getFrequency(String[] article, int n, String word) {
        // write code here
		int number=0;
		for(int i=0;i<n;i++){
			if(article[i].equals(word)){
				number++;
			}
		}
		return number;
    }
}
