package Generic_method;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestWildCard {

	public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<>();
		ArrayList<Manager> mgrs=new ArrayList<>();
		//emps=mgrs; AL<Employee> is not a super type of AL<Manager>
		ArrayList<Object> objs=new ArrayList<>();
//		objs=emps;
//		objs=mgrs;
		//? is unbound wildCard in Generics
		List<?> list=new ArrayList<>();
		list=emps;//no error as ? can be any unknown type and ArrayList is List
		list=mgrs;//no error as ? can be any unknown type and ArrayList is List
		list=objs;//no error as ? can be any unknown type and ArrayList is List
		list=new Vector<String>();
		list=new LinkedList<Double>();
	}
}
