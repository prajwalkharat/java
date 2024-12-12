


 
import java.util.*;

  class demo{
	  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter array size");
          int size=sc.nextInt();
	  int arr[]=new int[size];
	  System.out.println("enter array elements");
	  for(int i=0;i<arr.length;i++){
		  arr[i]=sc.nextInt();
	  }
	  for(int i=0;i<arr.length;i++){
		 if(arr[i]%5==0){
			 System.out.println("divisibal by 5"+arr[i]);
		 }
	  }
      }
  }
