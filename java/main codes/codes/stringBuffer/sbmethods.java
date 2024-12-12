








class demo{
	static String myreverse(String str){
	       char[] arr=str.tocharArray();
               int start=0;
               int end=arr.length;
	       	while(start<=end){
		        char temp=arr[start];
                         arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
		    }
	}
	public static void main(String[] args){
		StringBuffer str1=new StringBuffer();
		str1.append("ab");
		System.out.println(str1);
		str1.insert(1,"shashi");
		System.out.println(str1);
		str1.delete(2,4);
		System.out.println(str1);
		String str2="Core2web";
		StringBuffer str3=new StringBuffer(str2);
         	str2=str3.reverse().toString();
		System.out.println(str2);

	}
}
