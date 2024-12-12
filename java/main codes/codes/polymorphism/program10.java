



class Parent{
	char fun(){
		System.out.println("parent fun");
		return 'A';
	}
}
class child extends Parent{
	int fun(){
		System.out.println("child fun");
		return 10;
	}
}
class client10{
	public static void main(String[] args){
		Parent obj=new child();
		obj.fun();
	}
}


