class parent{
	parent(){
		System.out.println("in parent constructor");
	}
	void fun(int y){
		System.out.println("in parent fun");
	}
}
class child extends parent{
	child(){
		System.out.println("in child constructor");
	}
	void fun(){
		System.out.println("in child fun");
	}	
}
class client{
	public static void main(String[] args){
		parent temp = new child();
		temp.fun(10);

	}

}
