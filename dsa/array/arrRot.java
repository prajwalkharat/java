import java.io.*;
class arrRot{
	
	public static void main(String[] args)throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter array size");
		int n = Integer.parseInt(br.readLine());

	        int arr[] = new int[n];
		
		System.out.println("array:");

		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
			
		}  

		System.out.println("rotation");
	  	int rotate = Integer.parseInt(br.readLine());

		for(int i=1;i<=rotate;i++){
			
			int temp =arr[n-1];
			
			for(int j=n-1;j>0;j++){
				arr[i]=arr[i-1];
			}
			
			arr[0]=temp;

		 System.out.print("Array after rotation " + (i + 1) + ": ");
           	 for (int k = 0; k < arr.length; k++) {
        	        System.out.print(arr[k] + " ");
           	 }
          	  System.out.println();
						
		}	


	}
}
