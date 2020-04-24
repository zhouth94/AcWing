package cn.acwing;

public class 单链表快速排序 {
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
	 * 思想：快排，就是每次选取头结点作为排序基准，将结点数值分为 小于、等于、大于 三部分,接着每部分递归
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
		
		//链表尾结点
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
		
		//拼接三个链表
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
		单链表快速排序 d = new 单链表快速排序();
		
	}
	

}
