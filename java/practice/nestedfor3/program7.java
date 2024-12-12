







  class demo{
	  public static void main(String[] args){
		  int row=6;
		  char ch='F';
		  for(int i=1;i<=row;i++){
			  char ch1=ch;
			  for(int j=1;j<=i;j++){
				  System.out.print(ch1++);
			  }
			  ch--;
			  System.out.println();
		  }
	  }
  }
