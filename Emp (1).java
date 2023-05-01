package collection_1_may;

public class Emp {

	String ename;
	String address;
	int salary;
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", address=" + address + ", salary=" + salary + "]";
	}
	public Emp(String ename, String address, int salary) {
		super();
		this.ename = ename;
		this.address = address;
		this.salary = salary;
	}
	 
	
}
