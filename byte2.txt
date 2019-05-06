package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteExam {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/io/ByteExam.java");
			fos = new FileOutputStream("byte2.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];
			
			while( (readCount = fis.read(buffer) ) != -1 ) {
				fos.write(buffer, 0, readCount);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace(); 
		} finally {
			if( fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if( fis != null ) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
