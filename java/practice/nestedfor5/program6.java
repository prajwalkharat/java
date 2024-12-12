









import java.io.*;
     class demo{
	     public static void main(String[] args)throws IOException{

                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 char ch1=br.readLine().charAt(0);
		 char ch2=br.readLine().charAt(0);
		 int x=ch1-64;
		 int y=ch2-64;
		 if(ch1==ch2){
			 System.out.println(ch1);
			 System.out.println(ch2);
		 }
		 else{
		      System.out.println(y-x);
		 }
	     }
     }

		       
