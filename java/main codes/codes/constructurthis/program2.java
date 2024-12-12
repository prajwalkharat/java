



class Demo{
	int y=10;
	Demo(){
	//	System.out.println("No argument");
		System.out.println("constructure");
		System.out.println(this);

	}
	Demo(int x){
		System.out.println("para");
	}
	Demo(Demo xyz){
		System.out.println("para Demo");
	}
	{
		System.out.println("instance");
		System.out.println(this);
		System.out.println(this.y);
	}
	public static void main(String[] args){
		Demo obj=new Demo();
	//	Demo obj1=new Demo(10);
	//	Demo obj2=new Demo(obj);
	}
}
	

