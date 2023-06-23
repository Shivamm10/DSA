package codehelp.day4;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Pattern(n);
	}
	public static void Pattern(int n) {
		char a = 'A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(a++ +" ");
				
			}
			System.out.println();
		}
	}
}
