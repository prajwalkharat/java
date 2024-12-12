









      class plandrom{
	      public static void main(String[] args){
		      int N=3223;
		     int rev=0;
		     int temp=N;
		     while(N!=0){   
	                int rem=N%10;
		      rev=rev*10+rem;
		       N=N/10;
                            }
		     if (temp==rev){
			     System.out.println("it  is plandrome no");
		     }
			     else{
				     System.out.println("it not is plandrome no");
			     }

      } 
      }
