



class parent{
	parent(){
		System.out.println("parent constructor");
	}
	void property(){
		System.out.println("Home,car,Gold");
	}
	void marray(){
		System.out.println("Deepika Padukon");
	}
}
class child extends parent{
	child(){
		System.out.println("child constructor");
	}
	void marray(){
		System.out.println("Alia Bhatt");
	}
}
class client{
	public static void main(String[] args){
		child obj=new child();
		obj.property();
		obj.marray();
	}
}

