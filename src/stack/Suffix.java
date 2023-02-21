package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Suffix {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		int max = string.length();
		String[] result= new String[max];
		for(int i= 0;i<max;i++) {
			result[i] = string.substring(i,max);
		}
		Arrays.sort(result);
		for(int i = 0;i<max;i++) {
			System.out.println(result[i]);
		}
	}
}
