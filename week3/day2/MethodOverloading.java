package week3.day2;

public class MethodOverloading {
	public void reportStep(String msg, String sts)
	{
		System.out.println("reportStep printed");
	}
	public void reportStep(String msg, String sts, boolean boo )
	{
		System.out.println("new reportStep printed");
	}


	public static void main(String[] args) {
	MethodOverloading m=new MethodOverloading();
	m.reportStep("message", "status");
	m.reportStep("message", "status",true);
	}

}
