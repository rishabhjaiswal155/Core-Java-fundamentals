package com.app.runnable_task;

import java.util.Map;
import static java.lang.Thread.currentThread;
import static com.app.utils.CollectionUtils.*;
import static com.app.utils.IOUtils.*;
import com.app.core.Student;

public class SortDobTask implements Runnable {
	//instance variables
	private Map<String,Student> students;
	private String fileName;
	//parametrize constructor to initialize vars
	public SortDobTask(Map<String,Student> students,String fileName) {
		super();
		this.students=students;
		this.fileName=fileName;
	}
	@Override
	public void run() {
	   System.out.println(currentThread().getName()+" started");
	   try {
	      storeStudentDetails(sortStudentsPerDOb(students), fileName);   
	   System.out.println(currentThread().getName()+" over");
	   }
	   catch(Exception e) {
		System.out.println(currentThread().getName()+" got exception "+e);   
	   }
	   }
}
