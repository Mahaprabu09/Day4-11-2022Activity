package com.Day4112022Activity;

public class personDetails {
	String name;
	int age;
	double height;
	double weight;
	String work;
	int empid;
	String location;
	
	personDetails(String name,int age,double height,double weight,String work,int empid,String location)
	{
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.work=work;
		this.empid=empid;
		this.location=location;
		
		
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("height:"+height);
		System.out.println("Weight :"+weight);
		System.out.println("Work :"+work);
		System.out.println("Empid :"+empid);
		System.out.println("Location :"+location);
		System.out.println();
	}
}
