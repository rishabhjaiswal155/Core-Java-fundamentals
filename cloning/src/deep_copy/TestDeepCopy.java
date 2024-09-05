package deep_copy;

public class TestDeepCopy {

	public static void main(String[] args) throws Exception {
		Student s1=new Student(100);//100,null
		Address a1=new Address("Pune");//pune
		s1.setAdr(a1);//pune
		System.out.println(s1);//100,pune
		Student s2=s1.clone();//100,pune
		System.out.println(s2);//100,pune
		System.out.println(s1==s2);//false
		s1.setRollNo(200);//200
		s1.getAdr().setCity("Mumbai");//Mumbai
		System.out.println(s1);//200,Mumbai
		System.out.println(s2);//100,Pune
	}
}
