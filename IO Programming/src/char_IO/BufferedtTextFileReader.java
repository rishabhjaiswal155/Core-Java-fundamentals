package char_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedtTextFileReader {
	public static void main(String[] args) {
		//Read the Data from text file using buffer,till EOF  and display it using imperative style.
		System.out.println("Enter the path of file to read the data");
		try(Scanner sc=new Scanner(System.in);
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()))){
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println("file reading over....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
