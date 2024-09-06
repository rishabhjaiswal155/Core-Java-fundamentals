package p1;

public class Employee {
private int id;
private String name;
private String deptId;
public static int noOfEmployees;
private double salary;
public Employee(int id, String name, String deptId, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.deptId = deptId;
	this.salary = salary;
	noOfEmployees++;
}
public Employee(String name, double salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDeptId() {
	return deptId;
}
public void setDeptId(String deptId) {
	this.deptId = deptId;
}
public static int getNoOfEmployees() {
	return noOfEmployees;
}
public static void setNoOfEmployees(int noOfEmployees) {
	Employee.noOfEmployees = noOfEmployees;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
private double updateSalary(double increment) {
	System.out.println("Updated Salary");
	this.salary=this.salary+increment;
	return this.salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
}

}
