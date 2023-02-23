package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int min = Integer.parseInt(arr[0]);
		int max = Integer.parseInt(arr[1]);
		int[] primes = new int[max+1];
		primes[0] = 1;
		primes[1] = 1;
		primes[2] = 0;
		for(int i = 2;i<Math.sqrt(primes.length);i++) {
			for(int j = i+1;j<primes.length;j++) {
				if(j%i==0) {
					primes[j] = 1;
				}
			}
		}
		for(int i = min;i<primes.length;i++) {
			if(primes[i]==0) {
				System.out.println(i);
			}
		}
	}
}
