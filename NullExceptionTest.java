package exceptionhandlingDay2;


class trial{
	void show()
	{
		System.out.println("show method");
	}
}

public class NullExceptionTest
{

	public static void main(String[] args) {

		trial t;
		t= new trial();
		{
			t= null;
		}
		t.show();// NullPointerException
		System.out.println("bye");

}
}