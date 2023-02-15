package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Word {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(tc-->0) {
			String[] strings = br.readLine().split(" ");
			for(int i = 0; i<strings.length; i++) {
				Stack<String> stack = new Stack<>();
				for(int j = 0;j<strings[i].length();j++) {
					stack.push(strings[i].charAt(j)+"");
				}
				int max = stack.size();
				for(int j = 0; j<max;j++) {
					bw.write(stack.pop());
				}
				bw.write(" ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}
