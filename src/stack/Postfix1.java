package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		Stack<Character> oper = new Stack<>();
		String result = "";
		int[] init = new int[50];
		init['('] = -1;
		init[')'] = -1;
		init['*'] = 1;
		init['/'] = 1;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)>='A'&&string.charAt(i)<='Z') {
				result += string.charAt(i);
				continue;
			}else if(string.charAt(i)=='('){
				oper.push(string.charAt(i));
				continue;
			}else if(string.charAt(i)==')') {
				
				while(!oper.isEmpty()&&oper.peek()!='(') {
					result += oper.pop();
				}
				oper.pop();
				continue;
			}
			while(!oper.isEmpty()&&init[oper.peek()]>=init[string.charAt(i)]) {
				result += oper.pop();
				
			}
			oper.push(string.charAt(i));
		}
		while(!oper.isEmpty()) {
			result += oper.pop();
		}
		System.out.println(result);
	}
}
