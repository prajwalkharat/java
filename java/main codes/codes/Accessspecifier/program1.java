




class c2w{
	int numCourses=0;
	private String FavCourse="cpp";
	void display(){
		System.out.println(numCourses);
		System.out.println(FavCourse);
	}
}
class Student{
	public static void main(String[] args){
		c2w obj=new c2w();
		obj.display();
		System.out.println(obj.numCourses);
		System.out.println(obj.FavCourse);
	}
}

