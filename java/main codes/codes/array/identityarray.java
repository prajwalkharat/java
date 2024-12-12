






class demo{
        static	void  fun(int[] arr){
              arr[1]=70;
	      arr[2]=80;
	       System.out.println(System.identityHashCode(arr[1]));
	                       System.out.println(System.identityHashCode(arr[2]));
	}
	public static void main(String[] args){
		int arr[]={10,20,30,40};
	         System.out.println(System.identityHashCode(arr[0]));
	       System.out.println(System.identityHashCode(arr[1]));
	        System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
		demo obj=new demo();
		obj.fun(arr);
		for(int x:arr){
			System.out.println(x);
		}
		int x=20;
		int y=30;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
