package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class stack {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(tc-->0) {
			String[] commandAll = br.readLine().split(" ");
			String command = commandAll[0];
			int num = commandAll.length>1? Integer.parseInt(commandAll[1]):0;
			
			switch (command) {
			case "push":
				list.add(num);
				break;
			case "pop":
				if(list.size()==0) {
					bw.write(-1+"\n");
				}else {
					bw.write(list.get(list.size()-1)+"\n");
					list.remove(list.size()-1);
				}
				
				break;
			case "size":
				bw.write(list.size()+"\n");
				break;
			case "empty":
				if(list.size()==0) {
					bw.write(1+"\n");
				}else {
					bw.write(0+"\n");
				}
				break;
			case "top":
				if(list.size()==0) {
					bw.write(-1+"\n");
				}else {
					bw.write(list.get(list.size()-1)+"\n");
				}
				break;

			default:
				break;
			}
		}
		bw.flush();   //남아있는 데이터를 모두 출력시킴
		bw.close();
	}
}
