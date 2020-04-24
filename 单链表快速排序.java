package cn.acwing;

public class ������������� {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}
	}
	
	/**
	 * ˼�룺���ţ�����ÿ��ѡȡͷ�����Ϊ�����׼���������ֵ��Ϊ С�ڡ����ڡ����� ������,����ÿ���ֵݹ�
	 * @param head
	 * @return
	 */
	ListNode quickSortList(ListNode head) {
		//edge case
		if(head==null || head.next==null)
			return head;
		
		ListNode dummy = new ListNode(-1);
		
		ListNode left = new ListNode(-1);
		ListNode mid = new ListNode(-1);
		ListNode right = new ListNode(-1);
		
		//����β���
		ListNode ltail = left;
		ListNode mtail = mid;
		ListNode rtail = right;
		
		int value = head.val;
		
		for (ListNode p = head; p != null; p = p.next) {
			if(p.val < value) {
				ltail.next = p;
				ltail = ltail.next;
			}
			else if(p.val == value) {
				mtail.next = p;
				mtail = mtail.next;
			}else {
				rtail.next = p;
				rtail = rtail.next;
			}
		}
		
		/*ListNode p = head;
		while(p.next != null) {
			if(p.val < value) {
				p = ltail.next;
				ltail = p;
			}
			else if(p.val == value) {
				p = mtail.next;
				mtail = p;
			}else {
				p = rtail.next;
				rtail = p;
			}
			
			p = p.next;
		}*/
		
		ltail.next = null;
		mtail.next = null;
		rtail.next = null;
		
		left.next = quickSortList(left.next);
		right.next = quickSortList(right.next);
		
		//ƴ����������
		getTail(left).next = mid.next;
		getTail(left).next = right.next;
		
		return left.next;
		
	}

	private ListNode getTail(ListNode head) {
		while(head.next != null) {
			head = head.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		������������� d = new �������������();
		
	}
	

}
