package sort;

public class Selection {
	    public static String[] sort(String[] a)
	    {
	        int N = a.length;
	        for (int i = 0; i < N; i++)
	        {
	            int min = i;
	            for (int j = i+1; j < N; i++)
	                if (less(a[j],a[min])) min = j;
	            exch(a, i, min);
	        }
	        return a;
	    }  

	    private static boolean less(String v, String w)
	    {
	        return v.compareTo(w) < 0;
	    }
	    
	    private static void exch(String[] a, int i, int j)
	    {
	        String t = a[i]; 
	        a[i] = a[j];
	        a[j] = t;
	    }
	    
	    private static void show(String[] a)
	    {
	        for (int i = 0; i < a.length; i++)
	            System.out.println(a[i] + " ");
	    }
	    
	    public static boolean isSorted(String[] a)
	    {
	        for (int i = 1; i < a.length; i++)
	            if (less(a[i], a[i-1])) 
	                return false;
	            return true;
	    }
	    
	    public static void main(String[] args)
	    {
	    	/*
	    	Scanner s=new Scanner(System.in);
	    	int size=s.nextInt();
	    	String[] a=new String[size];
	    	for(int i=0;i<size;i++){
	    	    a[i]=s.next();
	    	}
	    	*/
	    	String[] a1={"a","b","c"};
	        //assert isSorted(a1);
	        show(sort(a1));
	    }

}
