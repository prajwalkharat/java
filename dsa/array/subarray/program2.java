class demo{
	
	public static void main(String[] args){
		
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,5};
		int maxEle = Integer.MIN_VALUE;
		int count=0;
		int n=10;

		for(int i =0;i<n;i++){
			if(arr[i]>maxEle){
				maxEle = arr[i];
			
			}
		}
		for(int i =0;i<n;i++){
			if(arr[i]==maxEle){
				count++;
			}
		}
		System.out.println(n-count);
	}

}
