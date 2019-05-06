package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamExam {
	public static void main(String[] args) {
		try (DataInputStream dis = new DataInputStream(new FileInputStream("dataOutput2.txt"));) {

			int i = dis.readInt();
			boolean b = dis.readBoolean();
			double d = dis.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
