package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Word2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String string = br.readLine();
		Stack<String> stack = new Stack<>();
		boolean tag = false;
		for(int i = 0;i<string.length();i++) {
			
			if(string.charAt(i)=='<') {
				tag = true;
				if(stack.size()>0) {
					int max = stack.size();
					for(int j=0;j<max;j++) {
						sb.append(stack.pop());
					}
				}
				
			}
			if(tag) {
				sb.append(string.charAt(i)+"");
			}else {
				if(string.charAt(i)==' ') {
					int max = stack.size();
					for(int j=0;j<max;j++) {
						sb.append(stack.pop());
					}
					sb.append(' ');
				}else {
					stack.push(string.charAt(i)+"");
				}
				
			}
			if(string.charAt(i)=='>') {
				tag = false;
			}
		}
		if(stack.size()>0) {
			int max = stack.size();
			for(int j=0;j<max;j++) {
				sb.append(stack.pop());
			}
		}
		System.out.println(sb);
	}
}
