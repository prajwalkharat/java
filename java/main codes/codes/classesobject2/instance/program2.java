


class Demo{
	int x=10;
	Demo(){
		System.out.println("constructur");
	}
	{
		System.out.println("in instance block");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		System.out.println("in main");
	}
	{
		System.out.println("instance block2");
	}
}


