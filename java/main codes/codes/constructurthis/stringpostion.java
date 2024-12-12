




class demo{
	public static void main(String[] args){
		int a=0;
	        String[] arr=new String[10];
		System.out.println(arr[0]);
		System.out.println(System.identityHashCode(arr[0]));
	         String str2="shashi";
		 System.out.println(System.identityHashCode(str2));
		  str2="bagal";
		  System.out.println(System.identityHashCode(str2));
		String str1=null;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(str1));
		a=10;
		str1="abcd";
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(str1));
	}
}
