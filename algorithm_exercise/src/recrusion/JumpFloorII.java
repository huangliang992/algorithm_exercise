package recrusion;

/**
 * �ݹ��̬��̨��
 * @author hl
 *
 */
public class JumpFloorII {
	public static int JumpFloor(int target) {
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            int num = 1;
            while(target > 1){
            	target = target -1;
                num = num + JumpFloor(target);
            }
            return num;
        }
    }
	
	public static void main(String args[]){
		System.out.println(JumpFloor(3));
	}
}
