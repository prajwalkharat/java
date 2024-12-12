




class demo{
	   static String myreverse(String str){
		   char[] arr=str.toCharArray();
	           int start=0;
		   int end=arr.length-1;
	           while(start<end){
		     char temp=arr[start];
	             arr[start]=arr[end];
		     arr[end]=temp;
	             start++;
		     end--;	
		   }
       		   String str1=new String(arr);
		   return str1;
	   }
	public static void main(String[] args){
		String str1="Core2Web";
		char a='A';
		char b='B';
		String ans=" ";
		ans=ans+a+b;
		 
		System.out.println(myreverse(str1));
		System.out.println(ans);
	}
}
