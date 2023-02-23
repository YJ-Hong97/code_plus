package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	static int[] arr = new int[1001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 0;
		for(int i = 2;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(j%i==0) {
					arr[j] = 1;
				}else {
				}
			}
		}
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		String[] Strings = br.readLine().split(" ");
		int result = 0;
		for(int i  = 0;i<Strings.length;i++) {
			int key = Integer.parseInt(Strings[i]);
			if(arr[key]==0) {
				result++;
			}
		}
		System.out.println(result);
	}

	
}
