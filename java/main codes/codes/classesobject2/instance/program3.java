



class Demo{
	int x=10;
	static int y=20;
	Demo(){
		System.out.println("in constructure");
	}
	static {
		System.out.println("in static block 1");
	}
	{
                System.out.println("in instance block1");
	}
	public static void main(String[] args){
		System.out.println("in main");
		Demo obj=new Demo();
		System.out.println("in main1");
	}
	static{
		System.out.println("in static block2");
      	}
	{
		System.out.println("in instance block2");
	}
}
class Demo2{
	static{
		System.out.println("in demo2 static");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
	}
}
	

	
