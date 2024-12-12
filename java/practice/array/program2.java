









import java.util.*;

     class demo{
	     public static void main(String[] args){
		     Scanner sc=new Scanner(System.in);
		     System.out.println("enter array size");
		     int size=sc.nextInt();
		     int mul=1;
		     int arr[]=new int[size];
		     System.out.println("enter array elements");
		     for(int i=0;i<arr.length;i++){
			    arr[i]=sc.nextInt();
			    if(arr[i]%2==0){
			             mul=mul*arr[i];
			    }
		     }
		     System.out.println("multification of two no :"  + mul);
	     }
     
		           }
		         
		     

