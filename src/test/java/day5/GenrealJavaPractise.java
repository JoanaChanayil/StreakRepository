 
package day5;

public class GenrealJavaPractise {

	public static void main(String[] args) {
		//evenNo();
		//oddNo();
		//primeNo();
		//displayPrime();
		//swapNo();
		//findLargestNo();
		//oddEvenNo();
		System.out.println("factorial  "+ factorial(5));
		
	}
	public static int factorial(int n)
	{
		
		if(n==0)
		{
			return 1;
		}
		return n*factorial(n-1);//recursion pgm calling itself
	}
	public static void oddEvenNo()
	{
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++)
			
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" --even");
			}else
			{
				System.out.println(a[i]+" --odd");
			}
		}
		
	}
	public static void findLargestNo()
	{
		int a[]= {1,4,7,3,8,0,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			if(a[i]>=a[j])
			{
				a[j]=a[i];
			}
		}
		System.out.println(a[a.length-1]);
	}
	public  static void swapNo()
	{
		int a= 5;
		int b=2;
//		int c=0;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println(a+"  "+b);
		//swap without third 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"  "+b);
	}
	
	public static void evenNo()
	{

	
			for(int i=50;i<=70;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
		
			}
		}
	//display odd number
	public static void oddNo()
	{
		for(int i=30;i<=50;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
	
		}
	}
	
	
	//prime number
	public static void primeNo()
	{
		
		int a=29;
		boolean flag =false;
		int c=0;
	for(int i=2; i<a/2;i++)
		{
			if(a%i==0)
			{
				//flag=true;
				c++;
				break;
			}
		}
	System.out.println(flag);
	if(c>=1)//flag is true then its not prime//ifusing flag if(flag)---then not prime
	{
		System.out.println("not Prime");
		
	}else
		System.out.println("prime");
		
		
	}
	//prime number from 1 to 100;
	 public static void displayPrime()
	 {
	 System.out.println("Prime numbers between 1 to 100 are:");
     for (int num = 2; num <= 100; num++) {
         boolean isPrime = true;
         for (int i = 2; i <= Math.sqrt(num); i++) {
             if (num % i == 0) {
                 isPrime = false;
                 break;
             }
         }
         if (isPrime) {
             System.out.print(num + " ");
         }
     }
	 }
}
