package com.collectioncore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student1
{
	int id;
	 String name;
	 long phoneNo;
	 
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}

	public Student1(int id, String name, long phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}

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

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	}
class NameComparator implements Comparator<Student1>
{
	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class By_Phone implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		if(o1.getPhoneNo()==o2.getPhoneNo())
		{
		return 0;
		}
		else if(o1.getPhoneNo()>o2.getPhoneNo())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	}
public class ComparetorConcept {
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<Student1>();
		list.add(new Student1(101, "swara", 992358812));
		list.add(new Student1(102, "shweta", 125863545));
		list.add(new Student1(10, "rupali", 123322));
		list.add(new Student1(9, "kiran", 2365422));
		System.out.println("by using name");
		Collections.sort(list, new NameComparator());
		list.forEach(a->System.out.println(a));
		System.out.println("by using phone");
		Collections.sort(list, new By_Phone());
		list.forEach(System.out::println);
	

	}
}

