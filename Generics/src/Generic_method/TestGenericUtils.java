package Generic_method;
import static Generic_method.GenericUtils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TestGenericUtils {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));
		printList(l1);
		LinkedList<String> l2=new LinkedList<>(Arrays.asList("Rishabh","Lucky","Surabhi"));
		printList(l2);
		
		ArrayList<Manager> mgrs=new ArrayList<>(Arrays.asList(new Manager(),new SalesManager(),new Manager()));
		computeEmpSal(mgrs);
	}
}
