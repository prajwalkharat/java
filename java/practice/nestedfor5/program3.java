







import java.io.*;
         class demo{
		 public static void main(String[] args)throws IOException{
	         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int row=Integer.parseInt(br.readLine());
		int temp=row;
		for(int i=1;i<=row;i++){
			int temp1=temp*i;
			for(int j=1;j<=row-i+1;j++){
				int temp2=temp1-i;
				 System.out.print(temp2+" ");

				
			}
			temp--;
			 System.out.println();
		}
		 
		 }
	 }

			 
