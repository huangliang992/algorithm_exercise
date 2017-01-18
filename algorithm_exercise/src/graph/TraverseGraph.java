package graph;

import java.util.ArrayList;
import java.util.List;

public class TraverseGraph {
	List<UndirectedGraphNode> l=new ArrayList<UndirectedGraphNode>();
	public void ptGraphNode(UndirectedGraphNode node){
		if(judge(node)){
			l.add(node);
			System.out.println(node.label);
			ArrayList<UndirectedGraphNode> gl=node.neighbors;
			for(int i=0;i<gl.size();i++){
				ptGraphNode(gl.get(i));
			}
		}
	}
	
	public boolean judge(UndirectedGraphNode u){
		boolean tag=true;
		for(int i=0;i<l.size();i++){
			if(l.get(i)==u){
				tag=false;
				break;
				}
		}
		return tag;
	}
}
