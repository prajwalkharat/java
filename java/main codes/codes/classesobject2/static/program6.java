class Demo{
	static {
		System.out.println("Static Block1");
	}
	public static void main(String[] args){
		System.out.println("in client main");
	}
}
class client{
	static {
		System.out.println("static block2");
	}
	public static void main(String[] args){
		System.out.println("inclient Main");
	}
	static {
		System.out.println("static block3");

	}
}
