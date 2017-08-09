package Éè¼ÆÄ£Ê½.µ¥Àý;

public class ¶öºº {

	private static ¶öºº singleton = new ¶öºº();
	
	private ¶öºº(){}
	
	public synchronized static ¶öºº getSingleton(){
		
		return singleton;
	}
	
}
