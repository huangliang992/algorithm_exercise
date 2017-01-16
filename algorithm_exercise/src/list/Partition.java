package list;

import java.util.ArrayList;
import java.util.List;

/**
 * ��д���룬�Ը���ֵxΪ��׼������ָ�������֣�����С��x�Ľ�����ڴ��ڻ����x�Ľ��֮ǰ
����һ�������ͷָ�� ListNode* pHead���뷵���������к�������ͷָ�롣ע�⣺�ָ��Ժ󱣳�ԭ��������˳�򲻱䡣
 * @author hl
 *
 */
public class Partition {
	public ListNode partition(ListNode pHead, int x) {
        // write code here
		ListNode i=pHead;
		int k=0;
		while(i!=null){
			k++;
			i=i.next;
		}
		i=pHead;
		int a[]=new int[k];
		int j=0;
		while(i!=null){
			a[j]=i.val;
			j++;
			i=i.next;
		}
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		for(int h=0;h<k;h++){
			if(a[h]<=x){
				l1.add(a[h]);
			}else{
				l2.add(a[h]);
			}
		}
		for(int m=0;m<l1.size();m++){
			a[m]=l1.get(m);
		}
		for(int m=0;m<l2.size();m++){
			a[l1.size()+m]=l2.get(m);
		}
		i=pHead;
		int n=0;
		while(i!=null){
			i.val=a[n];
			i=i.next;
			n++;
		}
		return pHead;
    }
	
	public static void main(String args[]){
		Partition p=new Partition();
		ListNode l=new ListNode(3);
		l.next=new ListNode(4);
		l.next.next=new ListNode(1);
		l.next.next.next=new ListNode(5);
		l.next.next.next.next=new ListNode(2);
		l.next.next.next.next.next=new ListNode(7);
		ListNode ln=p.partition(l, 3);
		while(ln!=null){
			System.out.println(ln.val);
			ln=ln.next;
		}
	}
}
