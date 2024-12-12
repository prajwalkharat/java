



class constructerdemo{
	constructerdemo(){
		System.out.println("in constructor");
	}
	void fun(){
		constructerdemo obj=new constructerdemo();
		 System.out.println(obj);
	}
	public static void main(String[] args){
		constructerdemo obj1=new constructerdemo();
		constructerdemo obj2=new constructerdemo();
		System.out.println(obj1);
		System.out.println(obj2);
		obj1.fun();

	}
}

