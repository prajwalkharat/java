




import java.util.*;
 class code{
	 public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter array size");
	     int size=sc.nextInt();
	     System.out.println("enter elements");
	     int arr[]=new int[size];
	     for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
	     }
	     System.out.println("enter array2 size");
	     int size1=sc.nextInt();
	     System.out.println("enter elements");
	     int arr1[]=new int[size1];
	     for(int i=0;i<arr1.length;i++){
		     arr1[i]=sc.nextInt();
	     }
	     for(int i=0;i<arr.length;i++){
		     for(int j=0;j<arr1.length;j++){
			     if(arr[i]==arr1[j]){
				     System.out.println("common "+arr[j]);
			     }
			     else
				     System.out.println("uncommon"+arr[i]+ " "+arr[j]);
		     }
	     }
	 }
 }


	     
