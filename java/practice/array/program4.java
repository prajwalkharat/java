






import java.io.*;
  class demo{
	  public static void main(String[] args)throws IOException{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter array size");
		 char size=(char)br.read();
		 char arr[]=new char[size];
		 int i=0;
		 System.out.println("enter array elements");
		 for( i=0;i<arr.length;i++){
			 arr[i]=(char)br.read();
			  if(arr[i]=='a' ||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				                                   System.out.println("voles: "+arr[i]);
								                            }
		 }
		 }
  }

