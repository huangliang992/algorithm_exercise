package stack;

import java.util.Stack;
/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * @author hl
 *
 */
public class Solution {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.add(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
    		int temp=stack1.pop();
    		stack2.push(temp);
    	}
    	int t=stack2.pop();
    	while(!stack2.isEmpty()){
    		int temp=stack2.pop();
    		stack1.push(temp);
    	}
    	return t;
    }
    public static void main(String args[]){
    	Solution s=new Solution();
    	
    }
}
