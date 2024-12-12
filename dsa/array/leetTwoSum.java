import java.io.*;

class TwoSum{
	
	public static void main(String[] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("enter size of array");

	int n =Integer.parseInt(br.readLine());
	
	System.out.println("enter array elements");

	int arr[] = new int[n];

	for(int i=0;i<n;i++){
		arr[i]=Integer.parseInt(br.readLine());
	}
	 
	System.out.println("target");
	int target = Integer.parseInt(br.readLine());
	
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(arr[i]+arr[j]==target && arr[i]!=arr[j])
				System.out.println("["+i+","+j+"]");
		}
	}

}
}
