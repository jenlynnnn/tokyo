package ghi;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	 public Person() {
		 
	 }
	 //getter 매서드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	//setter 메서드
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}


