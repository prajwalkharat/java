



   /*=5        =4
    o           
    14 13
    L K J
    9 8 7 6
    E D C B A
    */
import java.io.*;
 class demo{
	 public static void main(String[] args)throws IOException{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int row=Integer.parseInt(br.readLine());
		 int num=row;
		 int num1=row;
		 int sum=0;
		while(num!=0){
			sum=sum+num;
			 num--;

		}
		int ch=sum+64;
		char ch1=(char)ch;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){
		            if(i%2==1){
			     System.out.print(ch1 +" ");
			    }
			    else
			     System.out.print(sum +" ");
			   
			    ch1--;
			    sum--;
			}
			System.out.println();
		}
	 }
 }


			 
