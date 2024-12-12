











import java.io.*;

       class demo{
	       public static void main(String[] args)throws IOException{
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("enter player name");
                  String name=br.readLine();

		  System.out.println("enter jerno");
		  int jerno=Integer.parseInt(br.readLine());
		  System.out.println("enter avg");
		  float avg=Float.parseFloat(br.readLine());
		  System.out.println(name);
		  System.out.println(jerno);
		  System.out.println(avg);
	       }
       }


