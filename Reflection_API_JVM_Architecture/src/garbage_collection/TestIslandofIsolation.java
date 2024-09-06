package garbage_collection;

public class TestIslandofIsolation {
	TestIslandofIsolation i;

	public static void main(String[] args) {
		TestIslandofIsolation t1=new TestIslandofIsolation();
		TestIslandofIsolation t2=new TestIslandofIsolation();
		t1.i=t2;
		t2.i=t1;
		
		t1=null;//0 candidates marked for GC
		System.gc();
		System.out.println("After 1st gc ");
		t2=null;//2 candidates marked for GC
		System.gc();
		System.out.println("After 2nd gc ");
	}
		
		@Override
		protected void finalize() throws Throwable{
			System.out.println("finalize method called by: " +Thread.currentThread());
		}

	}
