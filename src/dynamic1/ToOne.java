package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToOne {
	static int[] arr = new int[1000001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		makeOne(n);
		System.out.println(arr[n]);
	}
	private static int makeOne(int n) {
		if(n==1) return 0;
		if(arr[n]>0) return arr[n];
		arr[n] = makeOne(n-1)+1;
 		if(n%2==0) {
 			int temp = makeOne(n/2)+1;
 			if(arr[n]>temp) arr[n]=temp;
		}
 		if(n%3==0) {
			int temp = makeOne(n/3)+1;
			if(arr[n]>temp) arr[n]=temp;
		}
		return arr[n];
	}
}
