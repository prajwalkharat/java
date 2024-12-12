class demo{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int n=10;
		int count=0;

		int maxEle = Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			
			if(arr[i]>maxEle){
				maxEle = arr[i];
			}
		}
		System.out.println(maxEle);

		for(int i =0 ; i<n ; i++){
			
			if(arr[i]==maxEle){
				count++;
			}
		}
		System.out.println(n-count);
	}
}
