class demo{
	int x =10;

	demo(){
		
		System.out.println("in constructor");
		System.out.println(this);
		System.out.println(this.x);

	}

	void fun(){
		System.out.println(this);
		System.out.println(x);
	}

	public static void main (String[] args){
		
		demo obj = new demo();
		System.out.println(obj);
		obj.fun();
	}
}
