






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
	  int min=arr[0];
	  int max=arr[0];
	  for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
			min=arr[i];
		}
	  }
	  for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
			max=arr[i];
		}

                                         
	  }

	  System.out.println("minimam element of array "+min);
	  System.out.println("max "+max);
	 }
 }

