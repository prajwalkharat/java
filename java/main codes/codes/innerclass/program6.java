


class Demo{
	Demo m2(){


		return new client();
	}
}

class client extends Demo{
	public client(){
	}
	void m3(){
              System.out.println("abcd");


	}

	public static void main(String[] args){

              Demo obj=new Demo();
	     Demo obj1=obj.m2();
	     obj1.m2();
	}
}

