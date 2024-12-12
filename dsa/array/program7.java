class demo{

	public static void main(String[] args){
	
	char arr[] = new char[]{'a','b','e','g','c','a','d','g'};

	int count=0;
	char x ='g';
	char temp=0;
	int itr=0;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]=='a'){
				
				char temp==arr[i];
					
					if(arr[i+1]=='g'){
						
						count++;
						itr++;
						i++;

					}else{
						i++;
					}
							
				}
			}
		}
		System.out.println(count);
		System.out.println(itr);
	} 

/*	int i=0;
	int j=0;
	int count=0;
	int itr=0;

		while(i<j){
		
			if(arr[i]=='a'){
				
				if(arr[j]=='g'){
					
					count++;
					itr++;
				}
			} 
			
		}	
		System.out.println(count);
	}*/
}
