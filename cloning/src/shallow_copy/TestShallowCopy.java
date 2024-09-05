package shallow_copy;

public class TestShallowCopy {

	public static void main(String[] args) throws Exception {
		Student s1=new Student(100);
		Address a1=new Address("Pune");
		s1.setAdr(a1);
		System.out.println(s1);
		Student s2=s1.clone();
		System.out.println(s2);
		System.out.println(s1==s2);
		s1.setRollNo(200);
		s1.getAdr().setCity("Mumbai");
		System.out.println(s1);
		System.out.println(s2);
	}
}
