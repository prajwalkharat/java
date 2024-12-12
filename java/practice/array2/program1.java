




import java.util.*;
   class demo{
	   public static void main(String[] args){
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter array size");
		   int size=sc.nextInt();
		   int sum=0;
		   System.out.println("enter elements");
		   int arr[]= new  int[size];
                   for(int i=0;i<arr.length;i++){
			   arr[i]=sc.nextInt();
			   sum=sum+arr[i];
		   }
		   System.out.println("enter sum of an array"+sum);
	   }
   }

