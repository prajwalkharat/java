







import java.util.*;
 class demo{
	 public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter array size");
		 int size=sc.nextInt();
		 System.out.println("enter elements");
		 int arr[]=new int[size];
		 for(int i=0;i<arr.length;i++){
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("enter element to search");
		 int ele=sc.nextInt();
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]==ele){
				 System.out.println("no of index "+i);
			 }
		 }
	 }
 }	 

