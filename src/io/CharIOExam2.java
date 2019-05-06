package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class CharIOExam2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		String line = null;
		try{
			br = new BufferedReader(new FileReader("src/io/CharIOExam2.java"));
			pw = new PrintWriter("charIOtest.txt");
			
			while((line = br.readLine()) != null) {
				pw.println(line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			pw.close();
			if(br != null) {
				try {
					br.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
