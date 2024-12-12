






import java.io.*;
      class demo{
	      public static void main(String[] args)throws IOException{
		      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		      System.out.println("enter name");
		      String name1=br.readLine();
		      
		      System.out.println("enter wing");
		      
		      char ch=(char)br.read();
		      br.skip(1);
		      System.out.println("enter flatno");
		      int FN=Integer.parseInt(br.readLine());
		      System.out.println(name1);
		      System.out.println(ch);
		      System.out.println(FN);
	      }
      }

