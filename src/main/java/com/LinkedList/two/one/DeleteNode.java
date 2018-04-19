package com.LinkedList.two.one;

public class DeleteNode {

	public static void main(String[] args) {
		LinkedListNode1<Integer> head = new LinkedListNode1<Integer>(1);
	    LinkedListNode1<Integer> node1 = new LinkedListNode1<Integer>(2);
	    LinkedListNode1<Integer> node2 = new LinkedListNode1<Integer>(3);
	    LinkedListNode1<Integer> node3 = new LinkedListNode1<Integer>(4);
	    head.next = node1;
	    node1.next  = node2;
	    node2.next = node3;
	    node3.next = null;
	    
	    deleteNode(node1);
	    while(head !=null){
				System.out.println(head.data);
				head = head.next;
			}
	}

	private static void deleteNode(LinkedListNode1<Integer> node) {
		/*node.data=(Integer) node.next.data;
		node.next= node.next.next;*/
		LinkedListNode1<Integer> next = node.next;
		node.data= next.data;
		node.next = next.next;
		
	}

}
