package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinusTwo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n =Long.parseLong(br.readLine());
		StringBuilder sb = new StringBuilder();
		if(n==0) {
			sb.append(0);
		}else {
			while(n!=1) {
				sb.append(Math.abs(n%-2)+"");
				n = (int)Math.ceil((double)n/-2);
			}
			sb.append("1");
		}
		
		System.out.println(sb.reverse());
	}
}
