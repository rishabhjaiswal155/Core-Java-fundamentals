package no_ITC;

public class Employee {
	private int id;
	private String name,deptid;
	private double sal;
	public Employee(int id, String name, String deptid, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.sal = sal;
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
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptid=" + deptid + ", sal=" + sal + "]";
	}
	

}
