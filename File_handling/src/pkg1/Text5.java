package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text5 {
	
	public void Write(int number) throws IOException
	{
		File f = new File("C:\\Users\\RAHUL TAAK\\Desktop\\file5.txt");
	    FileWriter fw = new FileWriter(f,true);
		BufferedWriter br=new BufferedWriter(fw);
		int r=0;
		for(int i=0;i<=10;i++)
			
		{	
		r=r+1;
			if(r==number)
			{
				br.write("welcome in automation");
				
				
			}
			br.newLine();
			
		}
		br.close();
	}
	public static void main(String[] args) throws IOException {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the line count");
		int a=sr.nextInt();
		Text5 t=new Text5();
		t.Write(a);
		
		
		
	}

}

