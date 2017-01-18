package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 对于一个有向图，请实现一个算法，找出两点之间是否存在一条路径。
给定图中的两个结点的指针UndirectedGraphNode* a,UndirectedGraphNode* b
(请不要在意数据类型，图是有向图),
请返回一个bool，代表两点之间是否存在一条路径(a到b或b到a)。
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
