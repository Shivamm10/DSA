package codehelp.day4;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Pattern(n);
	}
	public static void Pattern(int n) {
		for(int i=1;i<=n;i++) {
			int a = 1,b=i;
			for(int j=1;j<=n;j++) {
				if(j <= n-i) System.out.print(" ");
				else System.out.print(a++);
			}
			for(int j=1;j<i;j++) {
				System.out.print(--b);
			}
			System.out.println();
		}
	}
}
