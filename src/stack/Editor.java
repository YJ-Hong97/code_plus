package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Editor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();
		
		String init = br.readLine();
		for(int i = 0;i<init.length();i++) {
			left.push(init.charAt(i)+"");
		}
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0) {
			String[] commandLine = br.readLine().split(" ");
			switch (commandLine[0]) {
			case "L":
				if(left.size()>0) {
					right.push(left.pop());
				}
				break;
			case "D":
				if(right.size()>0) {
					left.push(right.pop());
				}
				break;
			case "B":
				if(left.size()>0) {
					left.pop();
				}
				break;
			case "P":
				String value = commandLine[1];
				left.push(value);
				break;

			default:
				break;
			}
			
		}
		int max = left.size();
		for(int i = 0;i<max;i++) {
			right.push(left.pop());
		}
		max = right.size();
		for(int i = 0;i<max;i++) {
			bw.write(right.pop());
		}
		bw.flush();
		bw.close();
	}
}
