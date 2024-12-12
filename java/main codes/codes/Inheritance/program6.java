





class parent4{
	int x=10;
	static int y=20;
	static{
		System.out.println("parent static block");
	}
	parent4(){
		System.out.println("in parent constructor");
	}

       void methodOne(){
	       System.out.println(x);
	       System.out.println(y);
       }
       static void methodTwo(){
	       System.out.println(y);
       }
}
class child4 extends parent4{
	static {
		System.out.println("in child static block");
	}
	child4(){
		System.out.println("in child constructor");
	}
}
class client4{
	public static void main(String[] args){
		child4 obj=new child4();
		obj.methodOne();
		obj.methodTwo();
	}
}
		
