package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Postfix {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		String string = br.readLine();
		Stack<Double> numbers = new Stack<>();
		Map<Character,Double> map = new HashMap<>();
		char character = 'A';
		for(int i = 0;i<tc;i++) {
			map.put(character,Double.parseDouble(br.readLine()));
			character++;
		}
		
		for(int i =0;i<string.length();i++) {
				if(string.charAt(i)>='A'&&string.charAt(i)<='Z') {
					numbers.push(map.get(string.charAt(i)));
				}else {
					String key = string.charAt(i)+"";
					double before = numbers.pop();
					double after = numbers.pop();
					switch (key) {
					case "+":
						numbers.push(after+before);
						break;
					case "-":
						numbers.push(after-before);
						break;
					case "*":
						numbers.push(after*before);
						break;
					case "/":
						numbers.push(after/before);
						break;
					
					}
				
				}
			
		}
		
		System.out.println(String.format("%.2f",numbers.pop()));
	}
}
