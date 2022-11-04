package com.Day4112022Activity;

public class gettersetter {
	String name;
	int empid;
	int age;
	String work;
	int salary;
	String location;

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public int getempid()
	{
		return empid;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setWork(String work)
	{
		this.work=work;
	}
	public String getWork()
	{
		return work;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;	
	}
	public int getSalary()
	{
		return salary;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}

	public static void main(String []arg)
	{
		gettersetter gs=new gettersetter();
		gs.setName("Mahaprabu");
		gs.setEmpid(983247);
		gs.setAge(22);
		gs.setWork("Software engineer");
		gs.setSalary(35000);
		gs.setLocation("Bangalore");

		System.out.println(gs.getName());
		System.out.println(gs.getempid());
		System.out.println(gs.getAge());
		System.out.println(gs.getWork());
		System.out.println(gs.getSalary());
		System.out.println(gs.getLocation());

	}
}
