package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GoldbachsConjecture {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = new int[1000001];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 0;
		for(int i =2;i<Math.sqrt(arr.length);i++) {
			for(int j = i*i;j<arr.length;j+=i) {
				if(j%i==0) {
					arr[j] = 1;
				}
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Integer key = null;
		while((key = Integer.parseInt(br.readLine()))!=0) {
			int A = 0;
			int B =0;
			int result = 0;
			for(int i = 3; i<arr.length/2;i= i+2) {
				if(arr[i]==0&&arr[key-i]==0) {
					A = i;
					B = key-i;
					result++;
					bw.write(key+" = "+A+" + "+B+"\n");
					break;
				}
				
			}
			if(result==0) {
				bw.write("Goldbach's conjecture is wrong.\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
