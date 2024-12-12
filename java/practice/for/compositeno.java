









       class composite{
	       public static void main(String[] args){
		       int N=6 ;
		       int count=0;
		       
		       for(int i=1;i<=N;i++){
			       if(N%i==0){
				       count++;
			       }
		       }
		       if(count>2){
			       System.out.println("it is a composite no");
		       }
		       else
			       System.out.println("it is not composite no");

	       }
       }
