package Generic_method;

public class Employee {
	public void computeSal() {
		System.out.println("Employee's computeSal");
	}
}

class Manager extends Employee{
	@Override
	public void computeSal() {
		System.out.println("Manager's computeSal");
	}
}

class SalesManager extends Manager{
	@Override
	public void computeSal() {
		System.out.println("SalesManager's computeSal");
	}
}

class Worker extends Employee{
	@Override
	public void computeSal() {
		System.out.println("Worker's computeSal");
	}
}

class TempWorker extends Worker{
	@Override
	public void computeSal() {
		System.out.println("TempWorker's computeSal");
	}
}
