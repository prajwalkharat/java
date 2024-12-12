



class parent5{
	int x=10;
	static int y=20;
	private int z=20;
	parent5(int z){
		z=this.z;
		System.out.println(z);
		System.out.println("parent5");
	}
	void access(){
		System.out.println(x);

	}

}
class child5 extends parent5{
	int x=100;
	static int y=200;
	child5(){
		super(0);
		System.out.println("child5");
	}
	void access(){
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(x);
		System.out.println(y);
		super.access();
	}

}
class client5{
	public static void main(String[] args){
		child5 obj=new child5();
		obj.access();
		System.out.println(obj.x);
		System.out.println(obj.x);
	}
}
