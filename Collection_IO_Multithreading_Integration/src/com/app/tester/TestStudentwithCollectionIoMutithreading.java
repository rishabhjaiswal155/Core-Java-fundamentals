package com.app.tester;
import static com.app.utils.CollectionUtils.populateMap;
import static java.lang.Thread.currentThread;
import java.util.Map;
import java.util.Scanner;
import com.app.core.Student;
import com.app.runnable_task.SortCgpaTask;
import com.app.runnable_task.SortDobTask;
public class TestStudentwithCollectionIoMutithreading {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter fileName to store sorted Student Details as per Dob");
			String fileName1=sc.nextLine();
			System.out.println("Enter fileName to store sorted Student Details as per Cgpa");
			String fileName2=sc.nextLine();
			//populate sample data
			Map<String,Student> students=populateMap();
			//create Thread instance with constructor Thread(RunnableTask instance,name)
			Thread t1=new Thread(new SortDobTask(students, fileName1),"dob_sorter"); //state:NEW
			Thread t2=new Thread(new SortCgpaTask(students, fileName2),"cgpa_sorter");//state:NEW
			t1.start();//state:Runnable
			t2.start();//state:Runnable
			//Runnable instance=3(1 main+ 2 threads)
			System.out.println("main waiting for children threads to complete the execution");
			t1.join();//main blocked on join  main is waiting for t1 execution to complete
			t2.join();//main blocked on join  main is waiting for t2 execution to complete
			System.out.println("main over");
		}catch(Exception e) {
			System.out.println(currentThread().getName()+" got Exception "+e);
		}
	}
}
