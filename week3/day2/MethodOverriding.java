package week3.day2;

public class MethodOverriding extends Edge {
	public void takeSnap()
	{
		System.out.println("New take snape");

}

	public static void main(String[] args) {

		MethodOverriding m=new MethodOverriding();
		m.takeSnap();
	}

}
