





class parent{
	parent(){
		System.out.println("in parent construcor");
	}
	void parentproperty(){
		System.out.println("flat,car,Gold");
	}
}
class child extends parent{
	child(){
		System.out.println("in child constructur");
	}
}
class client{
	public static void main(String[] args){
		child obj2=new child();
		obj2.parentproperty();
	}
}

