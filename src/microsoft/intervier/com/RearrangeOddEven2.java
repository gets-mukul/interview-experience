package microsoft.intervier.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class RearrangeOddEven2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(16);
		arr.add(9);
		arr.add(4);
		arr.add(3);
		arr.add(6);
		arr.add(11);
		arr.add(10);

		Queue<Integer> even = new PriorityQueue<Integer>();
		Queue<Integer> odd = new PriorityQueue<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		Collections.sort(arr);

		System.out.print("original: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i : arr) {
			if (i % 2 == 0) {
				even.add(i);
			} else {
				odd.add(i);
			}
		}

		System.out.print("even: ");
		for (int i : even) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.print("odd: ");
		for (int i : odd) {
			System.out.print(i + " ");
		}

		System.out.println();

		if (arr.get(0) % 2 == 0) {
			for (int i = 0; i < arr.size(); i++) {
				if (i % 2 == 0) {
					result.add(even.poll());

				} else {
					result.add(odd.poll());

				}
				if (even.size() == 0) {

					while (arr.size() != 0 && odd.size() != 0) {
						result.add(odd.poll());

					}
					break;
				} else if (odd.size() == 0) {

					while (arr.size() != 0 && even.size() != 0) {
						result.add(even.poll());

					}
					break;
				}
			}
		} else {
			for (int i = 0; i < arr.size(); i++) {

				if (i % 2 != 0) {
					result.add(even.poll());

				} else {
					result.add(odd.poll());

				}
				if (even.size() == 0) {

					while (arr.size() != 0 && odd.size() != 0) {
						result.add(odd.poll());

					}
					break;
				} else if (odd.size() == 0) {

					while (arr.size() != 0 && even.size() != 0) {
						result.add(even.poll());

					}
					break;
				}

			}
		}

		System.out.print("result: ");
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

}
