package Generic_method;
import java.util.List;
public class GenericUtils {
	public static void printList(List<?> list) {
		for(Object o:list) {
			System.out.println(o);
		}
	}
	public static void computeEmpSal(List<? extends Employee> emps) {
		for(Employee e:emps) {
			e.computeSal();
		}
	}
}
