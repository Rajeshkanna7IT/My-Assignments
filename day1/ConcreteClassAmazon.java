package week4.day1;

public class ConcreteClassAmazon extends CanaraBank implements Payments {
	
	public void cashOnDelivery()
	{
		System.out.println("payment details1");
	}
	public void upiPayments()
	{
		System.out.println("payment details2");
	}
	public void cardPayments()
	{
		System.out.println("payment details3");
	}
	public void internetBanking()
	{
		System.out.println("payment details4");
	}
	public static void main(String[] args)
	{
		ConcreteClassAmazon ac= new ConcreteClassAmazon();
		ac.cashOnDelivery();
		ac.upiPayments();
		ac.cardPayments();
		ac.internetBanking();
		ac.recordPaymentDetails();
	}
	@Override
	public void cashOndelivery() {
		// TODO Auto-generated method stub
		System.out.println("over ridding");
		
	}

}
