package Linkedlist;
//use concept of slow and fast pointer ,slow will increase with 1 and fast with 2
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class deleteMiddle {

public ListNode deleteMiddle(ListNode head) {
	if(head==null||head.next==null)
	{
		return null;
	}
	ListNode preSlow=null;
	ListNode fast=head;
	ListNode slow=head;
	 while(fast!=null && fast.next!=null)
	 {
		 preSlow=slow;
		 slow=slow.next;
		 fast=fast.next.next;
	 }
	 preSlow=slow.next;
	return head;   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
