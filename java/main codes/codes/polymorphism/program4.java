




class parent2{
        parent2(){
		System.out.println("parent constructor");
	}
         int fun(int y){
		System.out.println("in parent fun");
		return y;
	}
}
class child2 extends parent2{	
	child2(){
		System.out.println("child constructure");
	}
	float fun(int x){
		System.out.println("in child fun");
		return x;
	}
}
class client2{
	public static void main(String[] args){
		child2 obj=new child2();
		obj.fun(20);
              // System.out.println(obj.fun(10));
	}
}



