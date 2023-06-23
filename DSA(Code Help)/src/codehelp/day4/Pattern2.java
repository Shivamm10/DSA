package codehelp.day4;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n  = sc.nextInt();
		Pattern(n);
	}
	public static void Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}
