


/*
   D4 C3 B2 A1
   A1 B2 C3 D4
   D4 C3 B2 A1
   A1 B2 C3 D4
   */
import java.io.*;
   class demo{
	   public static void main(String[] args)throws IOException{
		   BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		  int row=Integer.parseInt(br.readLine());

		  for(int i=1;i<=row;i++){
			       int N=row;
			       int n=N+64;
			       char ch1=(char)n;
                               int num=1;
			       int num1=num+64;
			       char ch=(char)num1;
			  for(int j=1;j<=row;j++){
				  if(i%2==1){
			           System.out.print(ch1--);		  
				  System.out.print(N-- +" ");

				  }
				  else{
			           System.out.print(ch++);		  
			          System.out.print(num++  +" ");

				  }

			  }
			  System.out.println();
		  }
	   }
   }

		   
