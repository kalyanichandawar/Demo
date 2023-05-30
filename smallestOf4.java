class SmallestOf4 
{


	public static void main(String[] args) 
	{
	int a=65;
	int b=53;
	int c=42;
	int d=61;
	if (a<b&&a<c&&a<d)
	{	
      System.out.print ("a is smaller");
	}
	else if(b<c&&b<d)
		{
		  System.out.print ("b is smaller");
		}
	else if(c<d)
		{
		  System.out.print ("c is smaller");
		}

	else {
		
		  System.out.print ("d is smaller");
	     }
	}

}
