package char_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedtTextFileReaderCopyFilesDeclarative {
	public static void main(String[] args) {
		//Copy the data from one file to another using buffer 
		System.out.println("Enter the Src filename and Destination filename to copy the data");
		try(Scanner sc=new Scanner(System.in);
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine()))){
			 br
			.lines()//Method of BufferedReader public Stream<String> lines() throws IOException
			.forEach(pw::println);//l->pw.println(l);
			System.out.println("file copying over....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
