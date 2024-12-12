









     class demo{
	     public static void main(String[] args){
		     int row=6;
		     char ch='F';
		     int num=1;
		     for(int i=1;i<=row;i++){
			     char ch1=ch;
			     for(int j=1;j<=i;j++){
				     if (j%2==1){
					     System.out.print(ch1++ +" ");
				     }
				     else
				     System.out.print(num++ +" ");
			     }
			     ch--;
			     System.out.println();
		     }
	     }
     }

