package week3.day2;

public class Edge extends Safari {
	
	public void takeSnap(String snapshot)
	{
		System.out.println("takeSnap old method");
}
	public void takeSnap(String snapshot,String snapshot1)
	{
		System.out.println("takeSnap Method overloading");
}
	public void clearCookies()
	{
		System.out.println("clearCookies");
	}
		public static void main(String[] args)
		{
		Edge cc= new Edge();
		cc.openURL();
		cc.closeBrowser();
		cc.navigateBack();
		cc.takeSnap("snapshot");
		cc.takeSnap("snapshot","snapshot1");
		cc.clearCookies();
		System.out.println("var a ="+cc.a);
		System.out.println("var b ="+cc.b);
}
}
