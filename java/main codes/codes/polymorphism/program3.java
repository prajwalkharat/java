



class parent1{
	parent1(){
	System.out.println("parent constructor");
	}
       void fun(){
	       System.out.println("in parent fun");
       }
}
class child1 extends parent1{
	child1(){
		System.out.println("child constructor");
	}
	void gun(){
		System.out.println("in child fun");
	}
}
class client1{
	public static void main(String[] args){
		child1 obj=new child1();
		obj.fun();
		obj.gun();
		parent1 obj2=new parent1();
		obj2.fun();
	    //	obj2.gun();
	}
}

