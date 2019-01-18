//Delete N nodes after M nodes of a linked list
//Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes then delete next N nodes, continue the same till end of the linked list.
//
//Difficulty Level: Rookie
//
//Examples:
//
//Input:
//M = 2, N = 2
//Linked List: 1->2->3->4->5->6->7->8
//Output:
//Linked List: 1->2->5->6
//
//Input:
//M = 3, N = 2
//Linked List: 1->2->3->4->5->6->7->8->9->10
//Output:
//Linked List: 1->2->3->6->7->8
//
//Input:
//M = 1, N = 1
//Linked List: 1->2->3->4->5->6->7->8->9->10
//Output:
//Linked List: 1->3->5->7->9

package microsoft.intervier.com;

import java.util.LinkedList;

public class DeleteNnodeAfterMnode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(10);
		
		System.out.println(ll);
		
		LinkedList<Integer> result = new LinkedList<Integer>();
		int m = 1, n = 1, count = m;
		for(int i =0;i <ll.size(); i++) {
			
			if(count == 0) {
				i = i+n;
				count = m;
			}
			if(i<ll.size()) {
				result.add(ll.get(i));
				count--;
			}
			
		}
		System.out.println(result);

	}

}
