




class player{
	player(){
		private int jerNo=0;
		private String name=null;
		System.out.println(System.identityHashCode(this.name));
	}
		player(int jerNo,String name){
			this();
			jerNo=jerNo;
			name=name;
			System.out.println("In constructure");
			System.out.println(System.identityHashCode(this.name));
		}
		void info(){
			System.out.println(jerNo+"="+name);
		}
	
}
class client{
	public static void main(String[] args){
		player obj1=new player(18,"virat");
		obj1.info();
		player obj2=new player(7,"MSD");
		obj2.info();
		player obj3=new player(45,"Rohit");
		obj3.info();
	}
}
