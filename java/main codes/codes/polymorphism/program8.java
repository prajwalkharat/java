

class Demo{
	void fun(String str){
		System.out.println("String");
	}
	void fun(StringBuffer str1){
		System.out.println("StringBuffer");
	}
}
class client8{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun("shashi");
		obj.fun(new StringBuffer("shashi"));
		obj.fun(null);
	}
}

