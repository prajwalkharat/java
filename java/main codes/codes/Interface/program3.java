

interface Demo{
	void fun();
	void gun();
}
abstract class DemoChild implements Demo{
	public void fun(){
		 System.out.println("fun");
	}
}
class Demochild1 extends DemoChild {
	public void gun(){
		 System.out.println("gun");
	}
}
class Client3{
	public static void main(String[] args){
		Demo obj=new Demochild1();
		obj.fun();
		obj.gun();
	}
}

