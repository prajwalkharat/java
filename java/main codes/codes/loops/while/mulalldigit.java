










     class multiplicationdigit{
	     public static void main(String[] args){
		     int n=135;
		     int mul=1;
		     while(n!=0){
			     int rem = n%10;
			     mul = mul*rem;
			     n=n/10;
			     System.out.println(mul);
		     }
	     }
     }
