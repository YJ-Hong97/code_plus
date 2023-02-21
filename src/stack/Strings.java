package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine())!=null) {
			int[] arr = new int[4];
			//소문자,공백, 대문자, 숫자
			for(int i = 0; i<line.length();i++) {
				char word = line.charAt(i);
				if(word>=97&&word<=122) {
					arr[0]++;
				}else if(word>=65&&word<=90) {
					arr[1]++;
				}else if(word>=48&&word<=57) {
					arr[2]++;
				}else if(word==' ') {
					arr[3]++;
				}
			}
			for(int i = 0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
