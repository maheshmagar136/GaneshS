package com.collectioncore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student1 implements Comparable<Student1>
{
 int id;
 String name;
 long phoneNo;
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
public Student1(int id, String name, long phoneNo) {
	super();
	this.id = id;
	this.name = name;
	this.phoneNo = phoneNo;
}
@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
}
@Override
public int compareTo(Student1 o) {
	// TODO Auto-generated method stub
	if(o.getId()==id)
	{
	return 0;
	}
	else if (o.getId()>id)
	{
		return 1;
	}
	else
	{
		return -1;
	}
}
 
}
public class ComparableConcept {
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<Student1>();
		list.add(new Student1(101, "swara", 992358812));
		list.add(new Student1(102, "shweta", 125863545));
		list.add(new Student1(10, "rupali", 123322));
		list.add(new Student1(9, "kiran", 2365422));
		Collections.sort(list);
		list.forEach(a->System.out.println(a));
	

	}
	
}
