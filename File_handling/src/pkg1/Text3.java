package pkg1;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text3 {
	public static void main(String[] args) throws IOException {
  File f=new File("C:\\Users\\RAHUL TAAK\\Desktop\\file4.txt");
  FileWriter fw=new FileWriter(f,true);
  BufferedWriter b= new BufferedWriter(fw);
  System.out.println("enter the data for 5 lines");
  Scanner s=new Scanner(System.in);
  String k;
  for(int i=0;i<=5;i++)
  {
	 
	k=s.nextLine();
	b.write(k);
	b.newLine();
  }
	b.close();
  System.out.println("data entered");
  
	
	}

}
