package codehelp.day7;

import java.util.Scanner; 

public class ReverseInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int ans = Reverse(n);
		System.out.println(ans);
	}
	public static int Reverse(int n) {
		int ans = 0;
		while(n != 0) {
			int rem = n % 10;
			if((ans > Integer.MAX_VALUE/10) || (ans < Integer.MIN_VALUE/10)) {
				return 0;
			}
			ans = ans * 10 + rem;
			n = n / 10;
		}
		return ans;
	}
}
