package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphabet {
	static int[] arr = new int[123];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		for(int i = 0;i<string.length();i++) {
			char key = string.charAt(i);
			arr[key]++;
			
		}
		for(int i = 97;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
