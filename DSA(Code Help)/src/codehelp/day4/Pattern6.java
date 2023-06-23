package codehelp.day4;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Pattern(n);
	}
	public static void Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			for(int j=n-i+1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
