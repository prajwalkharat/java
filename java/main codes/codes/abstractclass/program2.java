


abstract class parent{
	void carrer(){
		System.out.println("Doctor");
	}
	abstract void marray();
}
class child extends parent{
	void marray(){
		 System.out.println("alkakubal");
	}
}
class client{
	public static void main(String[] args){
		parent obj1=new child();
		obj1.carrer();
		obj1.marray();
	}
}
