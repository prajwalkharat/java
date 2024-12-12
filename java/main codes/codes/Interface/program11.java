

interface Demo1{
	static void fun(){
		System.out.println("in fun demo1");
	}
}
interface Demo2{
	static void fun(){
		System.out.println("in fun demo2");
	}
}
class DemoChild implements Demo1,Demo2{
	public void fun(){
		System.out.println("in fun demoChild");
		Demo1.fun();
		Demo2.fun();
	}
}
class Client11{
	public static void main(String[] args){
	     DemoChild obj=new DemoChild();
	     obj.fun();
	}
}
