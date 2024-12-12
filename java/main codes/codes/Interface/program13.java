


//interface variable store into stackframe


interface Demo{
	int x=10;  //public static final int x;
        void fun(); //public abstract fun();
}
class DemoChild implements Demo{
	public void fun(){
		System.out.println(x);
		System.out.println(Demo.x);
	}
}
class client {
	public static void main(String[] args){
		Demo obj=new DemoChild();
		obj.fun();
	}
}


