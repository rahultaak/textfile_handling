package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Text2 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\RAHUL TAAK\\Desktop\\file1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		File f2 = new File("C:\\Users\\RAHUL TAAK\\Desktop\\file3.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		while ((s=br.readLine())!=null)
			{
		bw.write(s);
		bw.newLine();
			}
		
		bw.close();
		
	}

}
