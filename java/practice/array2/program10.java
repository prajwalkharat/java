


import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int arr1[]=new int[size];
		 System.out.println("enter elements");
		 for(int i=0;i<arr.length;i++){
			 arr[i]=Integer.parseInt(br.readLine());
		 }
		 for(int i=0;i<arr.length;i++){
		 
		 arr1[i]=arr[i];
		 }
		 System.out.println("output");
		 for(int i=0;i<arr.length;i++){
			 int sum=0;
		   while(arr[i]!=0){
			 int rem=arr[i]%10;
			 sum=sum+rem;
			arr[i]= arr[i]/10;
		   }
	           if(sum%2==0){
		     System.out.println(arr1[i]+" ");
		   }	     
		 }
		 
	}
}
