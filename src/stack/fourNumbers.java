package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class fourNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] string = br.readLine().split(" ");
		BigInteger[] arr = new BigInteger[2];
		arr[0] = new BigInteger(string[0]+string[1]);
		arr[1] = new BigInteger(string[2]+string[3]);
		System.out.println(arr[0].add(arr[1]));
	}
}
