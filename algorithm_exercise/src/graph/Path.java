package graph;

import java.util.ArrayList;

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
	public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        // write code here
		ArrayList<UndirectedGraphNode> list=a.neighbors;
		if(a==b){
			return true;
		}else{
			return false;
		}
    }
}
