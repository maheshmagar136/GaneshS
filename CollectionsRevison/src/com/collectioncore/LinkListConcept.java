package com.collectioncore;

import java.util.LinkedList;
import java.util.List;

class Student
{
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
public class LinkListConcept {
	public static void main(String[] args) {
		List<Student> lista = new LinkedList<Student>();
		lista.add(new Student(101, "maheesh", 20));
		lista.add(new Student(15, "mangesh", 25));
		lista.add(new Student(102, "kiran", 30));
		//lista.forEach(System.out::println);
		lista.stream().filter(std->std.getAge()==30).forEach(System.out::println);
	}

}
