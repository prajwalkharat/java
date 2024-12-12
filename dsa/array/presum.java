import java.util.*;

class presum{
	
	public static void main(String[] args){	
	int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
	int n= arr.length;
	int q =3;

	int pre[]=new int[n];
	pre[0]=arr[0];

	for(int i =1 ;i<arr.length;i++){
		pre[i]=pre[i-1]+arr[i];
	}
	
	int sum=0;



		
		Scanner sc = new Scanner(System.in);
		System.out.println("start");
		int start = sc.nextInt();
		System.out.println("end");
		int end = sc.nextInt();

         for(int i=0;i<q;i++){
		
		 for(int j=start;j<=end;j++){
		 	sum =sum+pre[j];
			break;
		 }
				
	}
	System.out.println(sum);
	
		
	
	
	}


}
