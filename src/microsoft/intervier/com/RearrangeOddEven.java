//Rearrange Odd and Even values in Alternate Fashion in Ascending Order
//Given an array of integers (both odd and even), the task is to arrange them in such a way that odd and even values come in alternate fashion in non-decreasing order(ascending) respectively.
//
//If the smallest value is Even then we have to print Even-Odd pattern.
//If the smallest value is Odd then we have to print Odd-Even pattern.
//Note: No. of odd elements must be equal to No. of even elements in the input array.
//
//Examples:
//
//Input: arr[] = {1, 3, 2, 5, 4, 7, 10}
//Output: 1, 2, 3, 4, 5, 10, 7
//Smallest value is 1(Odd) so output will be Odd-Even pattern.
//
//Input: arr[] = {9, 8, 13, 2, 19, 14}
//Output: 2, 9, 8, 13, 14, 19
//Smallest value is 2(Even) so output will be Even-Odd pattern.

package microsoft.intervier.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class RearrangeOddEven {

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

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i : arr) {
			System.out.print(i + " ");
		}

		for (int i : arr) {
			if (i % 2 == 0) {
				even.add(i);
			} else {
				odd.add(i);
			}
		}

		Collections.sort(even);
		Collections.sort(odd);

		int e = 0, o = 0;
		int size = arr.size();

		if (even.get(0) < odd.get(0)) {
			for (int i = 0; i < size; i++) {

				if (i % 2 == 0) {
					result.add(i, even.get(e));
					e++;
				} else {
					result.add(i, odd.get(o));
					o++;
				}
				if (e == even.size()) {
					i++;
					while (i < arr.size() && o < odd.size()) {
						result.add(i, odd.get(o));
						i++;
						o++;
					}
					break;
				} else if (o == odd.size()) {
					i++;
					while (i < arr.size() && e < even.size()) {
						result.add(i, even.get(e));
						i++;
						e++;
					}
					break;
				}
			}

		} else {
			for (int i = 0; i < size; i++) {

				if (i % 2 != 0) {
					result.add(i, even.get(e));
					e++;
				} else {
					result.add(i, odd.get(o));
					o++;
				}
				if (e == even.size()) {
					i++;
					while (i < arr.size() && o < odd.size()) {
						result.add(i, odd.get(o));
						i++;
						o++;
					}
					break;
				} else if (o == odd.size()) {
					i++;
					while (i < arr.size() && e < even.size()) {
						result.add(i, even.get(e));
						i++;
						e++;
					}
					break;
				}
			}
		}

		System.out.println();
		for (int i : result) {
			System.out.print(i + " ");
		}

	}

}
