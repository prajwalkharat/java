


class Parent{
       static  void fun(){
	      System.out.println("in parent-fun");
	}
}
class child extends Parent{
        static void fun(){
		System.out.println("in child-fun");
	}
}
class client11{
	public static void main(String[] args){
		Parent obj=new Parent();
		obj.fun();
		child obj1=new child();
		obj1.fun();
		Parent obj2=new child();
		obj2.fun();
	}
}
