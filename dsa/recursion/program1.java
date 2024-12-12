class fibo{

	public static long fib(int n){
		
		if(n<=0)
			return -1;
		
		long a=0;
		long b=1;
		
	
		for(long i=2; i<=n;i++){
			
			long c=a;
			a=b;
			b=c+a;
		}
		return b;
	}
	
	public static void main(String[] args){
		
		int n=10;
		System.out.println("fibonnachi number of `"+ n +" is "+ fib(n) );
	}
}
