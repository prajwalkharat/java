





 class code{
	 public static void main(String[] args){
		 int arr[]={10,20,30,40,50};
		 int arr1[]={9,18,27,36,45};
          	 int arr2[]=new int[10];
	      	for (int i=0;i<arr.length;i++){
	          arr2[i]=arr[i];
	
		}
		for(int i=0;i<arr1.length;i++){
	
	            arr2[i+5]=arr1[i];
	
	
		}
		for(int i=0;i<arr2.length;i++){
                  System.out.println(arr2[i]);

		}
	 }
 }

