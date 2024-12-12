class demp{
	
	public static void main (String[] args){
	
	int arr[] = new int{1,2,3,1,3,4,6,4,6,3};
	int maxEle = INTEGER.MIN_VALUE;
	int minEle = INTEGER.MAX_VALUE;
	
	for(int i=0; i<arr.length;i++){
		if(arr[i]>maxEle){
			maxEle=arr[i];
		}

		if(arr[i]<minEle){
			minEle=arr[i];
		}
	}

	}	
}
