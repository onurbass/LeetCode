package onurbas;

import onurbas.importedClasses.ListNode;

public class MergeTwoSortedList {

  public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
	ListNode head = new ListNode(-1);
	ListNode temp = head;
	while (list1 != null && list2 != null) {
	  if (list1.val <= list2.val) {
		temp.next = list1;
		list1 = list1.next;
	  } else {
		temp.next = list2;
		list2 = list2.next;
	  }
	  temp = temp.next;
	}
	temp.next = list1 == null ? list2 : list1;
	return head.next;
  }
}
