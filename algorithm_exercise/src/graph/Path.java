package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ����һ������ͼ����ʵ��һ���㷨���ҳ�����֮���Ƿ����һ��·����
����ͼ�е���������ָ��UndirectedGraphNode* a,UndirectedGraphNode* b
(�벻Ҫ�����������ͣ�ͼ������ͼ),
�뷵��һ��bool����������֮���Ƿ����һ��·��(a��b��b��a)��
 * @author hl
 *
 */
public class Path {
	

	public void ptGraphNode(UndirectedGraphNode node,ArrayList<UndirectedGraphNode> l){
		if(judge(node,l)){
			l.add(node);
			System.out.println(node.label);
			ArrayList<UndirectedGraphNode> gl=node.neighbors;
			for(int i=0;i<gl.size();i++){
				ptGraphNode(gl.get(i),l);
			}
		}
	}
	
	public boolean judge(UndirectedGraphNode u,ArrayList<UndirectedGraphNode> l){
		boolean tag=true;
		for(int i=0;i<l.size();i++){
			if(l.get(i)==u){
				tag=false;
				break;
				}
		}
		return tag;
	}
	
	public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        // write code here
		ArrayList<UndirectedGraphNode> l=new ArrayList<UndirectedGraphNode>();
		ptGraphNode(a,l);
		boolean flag=false;
		for(int i=0;i<l.size();i++){
			if(b==l.get(i)){
				flag=true;
				break;
			}
		}
		return flag;
    }
	public static void main(String args[]){
	
	}
}
