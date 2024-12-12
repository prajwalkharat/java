



import java.io.*;
       class demo{
	       public static void main(String[] args)throws IOException{
		       BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		      int[] arr1=new int[5];
		      for(int i=0;i<5;i++){
			      arr1[i]=Integer.parseInt(br.readLine());
		      }
		      for(int i=0;i<arr1.length;i++){
			      System.out.println(arr1[i]);
		      }
		      int arr2[]={20,20,20,20,20};
		      int arr3[]=new int[]{30,30,30,30,30};
		     // int arr4[]=new int[4]{40,40,40,40,40};
	       }
       }
