// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AXRSXf_a9qsDFAXS&categoryId=AXRSXf_a9qsDFAXS&categoryType=CODE

import java.util.Scanner;
class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		String outputFormat = "#%d %s\n";
		String on = "ON";
		String off = "OFF";
		int m, n;
		for (int test_case = 1; test_case <= T; test_case++) {
			n = sc.nextInt();
			m = sc.nextInt();
			while(n>0) {
				if(m % 2 == 0) {
					break;
				}
				m = m >> 1;
				n--;
			}
			System.out.printf(outputFormat, test_case, n==0 ? on : off);
		}
	}
}