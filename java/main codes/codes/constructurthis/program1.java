



class Demo{
	int x=10;
	Demo(){                                       //Demo(Demo this)
		System.out.println("In constructer");
		System.out.println(this);
		System.out.println(x);
		System.out.println(this.x);
	}
	void fun(){                            //fun(Demo this)
		System.out.println(this);
		System.out.println(this.x);
	}
	public static void main(String[] args){
		Demo obj=new Demo();             //Demo(obj)
		System.out.println(obj);
		obj.fun();
	}
}

