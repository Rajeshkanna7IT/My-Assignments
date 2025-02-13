package week3.day2;


public class CallingClass extends Edge {

	public void takeSnap()
	{
		System.out.println("takeSnap method overriding");
		super.takeSnap("snapshot");
}
	public static void main(String[] args)
	{
	CallingClass cc= new CallingClass();
	cc.openURL();
	cc.closeBrowser();
	cc.navigateBack();
	cc.takeSnap();
	cc.takeSnap("snapshot","snapshot1");
	cc.clearCookies();
	cc.readerMode();
	cc.fullScreenMode();
	//cc.takeSnap();
	//cc.clearCookies();
	//cc.readerMode();
	//cc.fullScreenMode();
	System.out.println("var a ="+cc.a);
	System.out.println("var b ="+cc.b);
}
}
