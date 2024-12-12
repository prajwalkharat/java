class demo{
	
	public static void main(String[] args){
		
	int arr[] = new int[]{8,4,1,3,9,2,6,7};

	int n = 8;
	int i = 0;
	int j = n-1;

		while(i<j){
			
			int temp = int arr[i];
			int arr[i] = int arr[j];
			int arr[j] = temp;

			i++;
			j--;
		}
	}
}
