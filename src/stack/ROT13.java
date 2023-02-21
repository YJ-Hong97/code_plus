package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {
	static char[] arr = new char[123];
  	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(char i = 'A';i<='z';i++) {
			arr[i] = i;
		}
		String result = "";
		for(int i = 0;i<str.length();i++) {
			char word = str.charAt(i);
			char newWord = 0;
			if(word>=65&&word<=90) {
				if(word+13>90) {
					newWord = arr[word-13];
				}else {
					newWord = arr[word+13];
				}
			}else if(word>=97&&word<=122) {
				if(word+13>122) {
					newWord = arr[word-13];
				}else {
					newWord = arr[word+13];
				}
			}else {
				newWord = word;
			}
			result+=newWord;
		}
		System.out.println(result);
	}
}
