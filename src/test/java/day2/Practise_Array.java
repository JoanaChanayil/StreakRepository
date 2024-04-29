package day2;

import java.util.Scanner;

public class Practise_Array {

	public static void main(String[] args) {
		Practise_Array p= new Practise_Array();
		//p.inputArray(3);
		//p.addArray();
		//removeDuplicates();
         p.findElement();
      
	}
	public void findElement()
	{
		 int[] a = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6};
	        int n = 0;
	        int c=0;
	        for(int i=0; i<a.length;i++)
	        {
	        	if(a[i]==n)
	        	{
	        		c++;
	         		System.out.println("Found the element: "+n);
	        	}	
	        }
	        System.out.println("The Element count is: "+c);

	}
	 public static int removeDuplicates() {
		 int[] a = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6};
	        int n = a.length;
	        if (n == 0 || n == 1) {
	            return n;
	        }
	        int j = 0;
	        for (int i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                a[j++] = a[i];
	            }
	        }
	        a[j++] = a[n - 1];
	        for (int i = 0; i < j; i++) {
	            System.out.print(a[i] + " ");
	        }
			
	        return j;
	       
	    }
	
	public int[] inputArray(int j)
	{
		Scanner sc= new Scanner(System.in);
		int a[]=new int[j];
		System.out.println("enter");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are:  ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		return a;
		
	}
	public void Stringinput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First String:");
		String s1=sc.next();
		System.out.println("Second String:");
		String s2=sc.next();
		
		String s3= s1+s2;
		System.out.println(s3);
		System.out.println("First NO:");
		int i1=sc.nextInt();
		System.out.println("Second No:");
		int i2=sc.nextInt();
		int i=i1+i2;
		System.out.println(i);
	}
	public void addArray()
	{
		int a[]=inputArray(3);
		int temp=0;
		for(int i=0; i<a.length;i++)
		{
			temp= temp+a[i];
			
		}
		System.out.println("Total of array sum:  "+temp);
		
		
	}

}
