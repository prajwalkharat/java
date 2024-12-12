







import java.util.*;
  class demo{
	  public static void main(String[] args){
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter array size");
		  int size=sc.nextInt();
		  int count=0;
		  int count1=0;
		  int sum=0;
		  int sum1=0;
		  System.out.println("enter elements");
		  int arr[]=new int[size];
		  for(int i=0;i<arr.length;i++){
			  arr[i]=sc.nextInt();
		  }
		  for(int i=0;i<arr.length;i++){
			 if(arr[i]%2==0){
				 count++;
				 sum=sum+arr[i];
			 }
			 else{
				 count1++;
				 sum1=sum1+arr[i];
			 }
		  }
		  System.out.println("no of even nos "+count);
		  System.out.println("no of odd nos "+count1);
		  System.out.println(sum);
		  System.out.println(sum1);
	  }
  }
