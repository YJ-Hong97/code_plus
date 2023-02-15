package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Bar {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		Stack<Integer> stack = new Stack<>();
		int size = 0;
		List<Integer> laser =new ArrayList<>();
		boolean left = false;
		for(int i = 0;i<string.length();i++) {
			if(string.charAt(i)=='(') {
				left = true;
				stack.push(i);
			}else {
				if(stack.size()>0) {
					if(left) {
						left = false;
						stack.pop();
						laser.add(i);
					}else {
						int leftIndex = stack.pop();
						for(int j =0;j<laser.size();j++) {
							if(laser.get(j)>leftIndex&&laser.get(j)<i) {
								size++;
							}
						}
						size++;
					}
				}else {
					
				}
				
			}
			
		}
		System.out.println(size);
	}
}
