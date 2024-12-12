class demo{
	public static void main(String[] args){
	
		int arr[] = new int[]{3,5,2,1,-3,7,8,15,6,13};
		int n =10;
		int k =10;
		int count = 0;

		for(int i =0;i<n;i++){
			
			for(int j=0;j<n;j++){
				
				if(arr[i]+arr[j]==k && i!=j){
				
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
