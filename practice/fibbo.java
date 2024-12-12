import java.io.*;

class demo{

	    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of terms:");
        int num = Integer.parseInt(br.readLine());

        
        fib(num);



		}
	}
