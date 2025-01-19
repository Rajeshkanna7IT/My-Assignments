package week1.day2;

public class Browser {
	public void launchBrowser()
	{
		System.out.println ("Browser has launched successfully");	
	}
	public void loadUrl()
	{
		System.out.println ("Application url has loaded successfully");
	}

	public static void main(String[] args) {
		Browser edgeobj = new Browser();
		edgeobj.launchBrowser();
		edgeobj.loadUrl();

	}

}
