package week3.day1;


public class FindIntersection {

	public static void main(String[] args)   {
		
		int a[]={1,2,3,4,5};
		int b[]={1,6,7,8,9};
		
		for ( int i=0 ; i<a.length ; i++)
		{
			for ( int j=0 ; j<b.length ; i++)
			{
				if(a[i]==b[j])
				{
				System.out.println("a["+i+"]="+a[i]+" matches with b["+j+"]="+b[j]);
			}
		}

	}
	}
}
