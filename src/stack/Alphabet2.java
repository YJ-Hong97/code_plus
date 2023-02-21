package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Alphabet2 {
	static Integer[] arr = new Integer[123];
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i<string.length();i++) {
			stack.push(string.charAt(i));
		}
		int length = string.length()-1;
		while(!stack.empty()) {
			arr[stack.pop()] = length;
			length--;
		}
		for(int i = 97; i<arr.length;i++) {
			if(arr[i]!=null) {
				System.out.print(arr[i]+" ");
			}else {
				System.out.print(-1+" ");
			}
		}
	}
}
