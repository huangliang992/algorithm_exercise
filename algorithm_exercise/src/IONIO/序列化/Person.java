package IONIO.序列化;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -936737274817938889L;

	private String name;
	
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "姓名"+ name + "年龄" + age ;
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
	
}
