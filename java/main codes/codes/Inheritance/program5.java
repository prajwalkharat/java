



class parent3{
	static int x=10;
	static {
		System.out.println("in parent static block");
	}
	static void access(){
		System.out.println(x);
	}
}
class child3 extends parent3{
	static {
		System.out.println("in child static block");
		System.out.println(x);
		access();
	}
}
class client3{
	public static void main(String[] args){
		System.out.println("in main");
		child3 obj=new child3();
		obj.access();
		child3.access();
		parent3.access();
	}
}


