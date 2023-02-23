package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class TwoToEight {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = br.readLine();
		Stack<String> stack = new Stack<>();
		for(int i = n.length();i>0;i-=3) {
			String sub = null;
			if(i-3<0) {
				sub = n.substring(0,i);
			}else {
				sub = n.substring(i-3,i);
			}
			int temp = Integer.parseInt(sub);
			stack.push(temp%8+"");
			
		}
		while(!stack.empty()) {
			bw.write(stack.pop());
		}
		bw.flush();
		bw.close();
	}
}
