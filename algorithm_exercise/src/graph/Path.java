package graph;

import java.util.ArrayList;

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
