








import java.util.*;
 class oddIndex{
	 public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int mul=1;
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(i%2==0){
				mul=mul*arr[i];
			}

		}
		System.out.println("multiplication of oddIndex: "+mul);
	 }
 }
			
		

