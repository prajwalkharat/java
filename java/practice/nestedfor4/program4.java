





   class demo{
	   public static void main(String[] args){
		   int row=4;
		   for(int i=1;i<=row;i++){
			  int  num=i;
			   for(int j=1;j<=row-i+1;j++){
				   System.out.print(num++ +" ");
			   }
			   System.out.println();
		   }
	   }
   }
