package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sequence {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		int[] push = new int[tc+1];
		int[] pop = new int[tc+1];
		int top = 0;
		Boolean result = true;
		while(tc-->0) {
			int num = Integer.parseInt(br.readLine());
			if(top!=num) {
				if(top>num) {
					System.out.println("NO");
					result = false;
					break;
				}else {
					int min = top+1;
					int max = num+1;
					for(int i = min;i<max;i++) {
						if(push[i]==0) {
							push[i] = i;
							sb.append("+\n");
							top = i;
						}
					}
					pop[top] = top;
					sb.append("-\n");
					for(int i=top-1;i>0;i--) {
						if(push[i]!=0&&pop[i]==0) {
							top = i;
							break;
						}
					}
				}
			}else {
				pop[top] = top;
				sb.append("-\n");
				for(int i=top-1;i>0;i--) {
					if(push[i]!=0&&pop[i]==0) {
						top = i;
						break;
					}
				}
			}
			
			
		}
		if(result) {
			System.out.println(sb);
		}else {

		}
		
	}
}
