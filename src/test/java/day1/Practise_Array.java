package day1;

public class Practise_Array {
	
 public static void main(String[] args) {
	 Practise_Array p= new Practise_Array();
	 //p.maxArea();
	 //p.merge();
	 //p.sortArray();
	 //p.removeVal();
}
 public void removeVal() {
	 int b[]= {2,4,3,5,6,4,3,2};
	 int r=3;
	 int j=0;
	 for(int i=0;i<b.length;i++)
	 {
		 if(b[i]!=r)
		 {
			 b[j]=b[i];
			 System.out.println(b[j]);
			 j++;
		 }
	 }
	 
 }
 public void sortArray()
 {
	 
	 int b[]= {6,8,3,4,9};
	 int temp=0;
	 for(int i=0;i<b.length;i++)
	 {
		 for(int j=i+1;j<b.length;j++)
		 {
			 if(b[i]>b[j])
			 {
				 temp=b[i];
				 b[i]=b[j];
				 b[j]=temp;
			 }
		 }
		 
	 }
	 for(int i=0;i<b.length;i++)
	 {
		 System.out.print(b[i]+"  ");
	 }
 }
 
 public void merge()
 {
	 int a[]= {1,2,3,5,8};
	 int b[]= {4,6,9,7,3};
	
	 int c[]= new int [(a.length+b.length)];
	 System.out.println(c.length);
	 for(int i=0;i<a.length;i++)
	 {
		 c[i]=a[i];
		 //c[a.length+i]=b[i];
		// c[a.length+i]=b[i];
	 }
	 for(int i=0;i<b.length;i++)
	 {
		 c[a.length+i]=b[i];
	 }
	 for(int i=0;i<c.length;i++)
	 {
		 System.out.println(c[i]);
	 }
	 
 }
//to find the max area of the container
 public void maxArea()
 {
	 int height[]= {1,3,5,3,6};
	 int a=height.length;
	 int l=0;
	 int r=a-1;
	 int maxarea=0;
	  while(l<r)
	  {
		 int currentArea= Math.min(height[l], height[r])*(r-l);
		 maxarea=Math.max(maxarea, currentArea);
		 if(height[l]<height[r])
		 {
			 l++;
		 }
		 else
		 {
			 r++;
		 }
	  }
	  System.out.println("Max Area:  "+maxarea);
	 
 }
}
