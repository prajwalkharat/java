


interface Demo{
	static void fun(){           //public static void fun
		System.out.println("in fun demo");
	}
	default void gun(){         //public default void gun
		System.out.println("in gun demo");
	}
}

