


class Demo{
	void fun(Object obj1){
		System.out.println("objcet");
	}
	void fun(String str){
		System.out.println("String");
	}
}
class client9{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun("core2Web");
		obj.fun(new StringBuffer("shashi"));
		obj.fun(null);
	}
}
