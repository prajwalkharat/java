


     /*
      0
      1 1
      2 3 5 
      8 13 21 34
      */
  
import java.io.*;
   class demo{
	   public static void main(String[] args) throws IOException{

		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   int row=Integer.parseInt(br.readLine());
		   int a=0;
		   int b=1;
		   int c=0;
		   for(int i=1;i<=row;i++){
			   for(int j=1;j<=i;j++){
				   System.out.print(c+" ");
				   a=b;
				   b=c;
				   c=a+b;
			   }
			   System.out.println();
		   }
	   }
   }

