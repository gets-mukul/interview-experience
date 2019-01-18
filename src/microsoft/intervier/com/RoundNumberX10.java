
//Round the given number to nearest multiple of 10
//Given a positive integer n, round it to nearest whole number having zero as last digit.
//
//Examples:
//
//Input : 4722
//Output : 4720
//
//Input : 38
//Output : 40
//
//Input : 10
//Output: 10

package microsoft.intervier.com;

import java.util.Scanner;

public class RoundNumberX10 {

	public static void  main(String[] args) {
		
		
		System.out.print("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int last_digit = num % 10;

		if (last_digit <= 5) {
			num = num - last_digit;
		} else {
			num = num + (10 - last_digit);
		}

		System.out.println((38/10));

	}

}
