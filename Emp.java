package collection_1_may;

public class Emp {

	String ename;
	String address;
	public Emp(String ename, String address) {
		super();
		this.ename = ename;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", address=" + address + "]";
	}
	
}
