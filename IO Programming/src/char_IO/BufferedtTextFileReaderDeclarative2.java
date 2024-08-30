package char_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedtTextFileReaderDeclarative2 {
	public static void main(String[] args) {
		//Read the Data from text file using buffer,till EOF,filter  lines having line length >50,upperCase contents and then display it using Declarative style.
		System.out.println("Enter the path of file to read the data");
		try(Scanner sc=new Scanner(System.in);
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()))){
			 br
			.lines()//Method of BufferedReader public Stream<String> lines() throws IOException
			.filter(l->l.length()>50)
			.map(l->l.toUpperCase())
			.forEach(System.out::println);
			System.out.println("file reading over....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
