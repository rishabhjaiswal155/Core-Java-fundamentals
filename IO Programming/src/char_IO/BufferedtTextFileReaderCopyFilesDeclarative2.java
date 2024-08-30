package char_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedtTextFileReaderCopyFilesDeclarative2 {
	public static void main(String[] args) {
		//Copy only lines from src file with length>40  to destination file using buffer 
		System.out.println("Enter the Src filename and Destination filename to copy the data");
		try(Scanner sc=new Scanner(System.in);
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine()))){
			 br
			.lines()//Method of BufferedReader public Stream<String> lines() throws IOException
			.filter(l->l.length()>40)
			.forEach(pw::println);//l->pw.println(l);
			System.out.println("file copying over....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
