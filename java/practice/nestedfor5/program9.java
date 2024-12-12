








import java.io.*;
class demo{
public static void main(String[] args)throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int N=Integer.parseInt(br.readLine());
	 int mul=1;
	 int sum=0;
	 while(N!=0){
	      int  rem=N%10;
	    int  r=rem;
		 while(r!=0){
			 mul=mul*r;
			 r--;
		 }
		 sum=sum+mul;
		 N=N/10;
	 }
	 System.out.println(sum);
    }
}

			 
