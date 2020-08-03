package ClassEx04;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void show() {
		System.out.println(name+""+age+"");
	}
}

class Student extends Person{
	public Student(String name, int age) {
		
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	String major;
	super(name, age);//생성자
	//show함수
}

public class Exam {
		public static void exam() {
			Person p=new Student("홍길동",25,"컴퓨터공학");
			p.show();
	}

}
