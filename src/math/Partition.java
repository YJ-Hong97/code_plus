package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Partition {
	 public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = new int[1000001];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 0;
		for(int i= 2;i<Math.sqrt(arr.length);i++) {
			for(int j = i*i;j<arr.length;j+=i) {
				if(j%i==0) {
					arr[j] = 1;
				}
			}
		}
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0) {
			int num  = Integer.parseInt(br.readLine());
			int count =0;
			for(int i  =2;i<=num/2;i++) {
				if(arr[i]==0&&arr[num-i]==0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
