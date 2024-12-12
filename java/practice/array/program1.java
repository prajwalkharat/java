 



import java.util.*;
 class demo{
	 public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter array size");
		 int size=sc.nextInt();
		 int arr[]=new int[size];
		 int sum=0;
		 System.out.println("enter elements");
		 for(int i=0;i<arr.length;i++){
			 arr[i]=sc.nextInt();
			if(arr[i]%2==1){
				sum=sum+arr[i];
			}
		 }
		 System.out.println("sum of odd array="+sum);
	 }
 }


