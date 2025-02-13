package week3.day2;

public class Safari extends Browser {

	public void readerMode()
	{
		System.out.println("readerMode");
}
	
	public void fullScreenMode()
	{
		System.out.println("fullScreenMode");
	}
	public static void main(String[] args)
	{
	Safari cc= new Safari();
	cc.openURL();
	cc.closeBrowser();
	cc.navigateBack();
	cc.readerMode();
	cc.fullScreenMode();
	System.out.println("var a ="+cc.a);
	System.out.println("var b ="+cc.b);
}
}
