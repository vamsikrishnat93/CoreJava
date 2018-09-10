package com.Runtimepolymorphism;

public class Lab393 {
	public static void main(String[] args) {
		Person pob=null;
		pob=new Student();
		pob.eating();
		pob=new Employee();
		pob.eating();
pob=new Person();
pob.eating();
	}
}
class Person{
	void eating(){
		System.out.println("Person->eating");
	}
void walking(){
	System.out.println("Person->walking");
	}
void sleeping(){
	System.out.println("Person->sleeping");
}
}
class Employee extends Person{
	void eating(){
		System.out.println("Employee->eating");
	}
void walking(){
	System.out.println("Employee->walking");
	}
void working(){
	System.out.println("Employee->sleeping");
}
}
class Student extends Person{
	void eating(){
		System.out.println("Student->eating");
	}
void walking(){
	System.out.println("Student->walking");
	}
void reading(){
	System.out.println("Student->reading");
}
}