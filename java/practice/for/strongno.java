










       class strongno{
	       public static void main(String[] args){
		       int N=145;
		       int mul=1;
		      int sum=0;
		      int temp=N;

		       while(N!=0){
	                 int  rem =  N%10;
			       for(;rem!=0;rem--) {
				       
                                   mul=mul*rem;
			       }
			       sum=sum+mul;
                                             


                           N=N/10;
                        }
		       if (sum == temp){
			       System.out.println("it is a strong no");
		       }
		       else
			       System.out.println("it is not a strong no");

	       }
       }	       
