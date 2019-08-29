package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Text4 {
	
	public int read(int st,int end) throws IOException
	{
		
		File f=new File("C:\\Users\\RAHUL TAAK\\Desktop\\file4.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int r=0;
		while((s=br.readLine())!=null)
		{
			r=r+1;
			
			if ((r>=st)&&(r<=end))
					{
				    System.out.println(s);
					}
			
			
		}
		return 0;
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the start line number");
		int a = sr.nextInt();
		System.out.println("enter the end line number");
		int b=sr.nextInt();
		
		Text4 read = new Text4();
		read.read(a, b);
		
		
	}

}
