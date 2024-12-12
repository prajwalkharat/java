



class Demo{
       static void fun(int x){
		System.out.println(x);
	}
        static void fun(float x){
		System.out.println(x);
	}
	static void fun(Demo obj){
		System.out.println(obj);
        }
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10);
		obj.fun(10.5f);
		Demo obj1=new Demo();
		obj.fun(obj);
	}

}
