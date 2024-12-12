

interface Demo1{
	default void fun(){
		System.out.println("in fun demo1");
	}
}
interface Demo2{
	default void fun(){
		System.out.println("in fun demo2");
	}
}
class DemoChild implements Demo1,Demo2{
       public void fun(){
		System.out.println("in fun demoChild");
	}

}
class Client9{
	public static void main(String[] args){
		Demo1 obj=new DemoChild();
		obj.fun();
		DemoChild obj1=new DemoChild();
		obj1.fun();
		Demo2 obj2=new DemoChild();
		obj2.fun();
	}
}
