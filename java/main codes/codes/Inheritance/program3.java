




class parent1{
	int x=10;
	parent1(){
		System.out.println("in parent constructur");
	}
	void access(){
		System.out.println("parent Instance");
	}
}
class child1 extends parent1{
	int x=20;
	child1(int x){
	   System.out.println("in child constructure");
	   System.out.println(x);
	   System.out.println(this.x);
	   System.out.println(super.x);
	   
	}
}
class client1{
	public static void main(String[] args){
		child1 obj1=new child1(30);
		obj1.access();
	}
}

