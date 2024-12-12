









        class evensquare{
		public static void main (String[] args){
			int N=942111423;

			while(N!=0){
		              int x=  N%10;
				if(x%2==0){
                                     x=x*x;
				     System.out.println(x);
				
				}
				N=N/10;
			}
		}
	}
