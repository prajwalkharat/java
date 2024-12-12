



class lengthDemo{
	public static void main(String[] args){
		String str1="Ashish";
		String str2="ashish";
		String str3=new String("Ashish");
		String str4="Core2Web tech";
		System.out.println(str1.length());
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareToIgnoreCase(str3));
	//	compareToIgnoreCase
	        System.out.println(str1.equals(str3));
                  //Tochar Array
		char[] arr=str1.toCharArray();
		System.out.println(arr.length);
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.indexOf('h',0));
		System.out.println(str1.indexOf('h',1));
		System.out.println(str1.indexOf('h',3));
		System.out.println(str1.lastIndexOf('h',6));
		System.out.println(str1.lastIndexOf('h',5));
		System.out.println(str1.lastIndexOf('h',0));

	//	str1=str1.replace('h','p');
		System.out.println(str1);
		System.out.println(str4.substring(5));
		System.out.println(str4.substring(0,3));
	}
}
