








      class optimization{
	      public static void main(String[] args){
		      int N=15;
		      int count=0;
		      int i=1;
		      for(i=1;i<=N;i++){
			      if(N%i==0){
				      count++;
			      }
			      if(count>2){
				      break;
			      }
			      
		      }
		      System.out.println(i);
		      
		      if(count==2){
			      System.out.println("it is a prime no");
		      }
		      else
			      System.out.println("it is not a prime no");

	      }
      }
