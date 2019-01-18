//Linked List Sum of Nodes Between 0s
//Given a linked list which contains series of numbers seperated by “0”. Add them and store in the linked list in-place.
//Note :There will not be continuous zeros in input.

//Examples:

//Input  : 1->2->3->0->5->4->0->3->2->0
//Output : 6->9->5

//Input  : 1->2->3->4
//Output : 1->2->3->4

package microsoft.intervier.com;

import java.util.LinkedList;

public class SumOfNodes {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(0);
		ll.add(5);
		ll.add(4);
		ll.add(0);
		ll.add(3);
		ll.add(2);
		ll.add(0);

		LinkedList<Integer> result = new LinkedList<>();
		System.out.println(ll);

		int sum = 0;

		for (int i = 0; i < ll.size(); i++) {
			
			if (ll.get(i) == 0) {
				if (sum != 0) {
					result.add(sum);
					sum = 0;
				}
			}

			sum = sum + ll.get(i);
		}
		if (sum != 0) {
			result.add(sum);
		}

		System.out.println(result);

	}

}
