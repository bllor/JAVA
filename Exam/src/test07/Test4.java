package test07;
/*
 * 날짜: 2023/07/20
 * 이름: 최동일
 * 내용: 확인문제 4번
 */

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	protected void Hello() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	
}

class Student extends Person{
	

	private int studentId;
	public Student(String name, int age,int studentId) {
		super(name, age);
		this.studentId= studentId;
		// TODO Auto-generated constructor stub
	}
	
	
	public void Hello() {
		super.Hello();
		System.out.println("학번 : "+studentId);
	}
	
}

class Worker extends Person{
	

	private int workId;
	public Worker(String name, int age, int workId) {
		super(name, age);
		this.workId= workId;
		// TODO Auto-generated constructor stub
	}
	
	public void Hello() {
		super.Hello();
		System.out.println("사번 : "+workId);
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		
		Student kim = new Student("김유신", 21, 20201234);
		Worker lee = new Worker("이순신", 35, 20211201);
		
		kim.Hello();
		lee.Hello();
	}
}
