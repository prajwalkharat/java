









            class odd{
		    public static void main(String[] args){
			    int N=942111423;
			    int count=0;
			    while(N!=0){
				  int  i=N%10;
				    if (i%2==1){
					     count++;
				    }
				    N=N/10;
			    }
			    System.out.println(count);
		    }
	    }

