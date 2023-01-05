package org.anudip.pojo;

public class Student {

private int id;
private String name;
public Student() {
	super();
	System.out.println("I am static-----------");
}
public Student(int id, String name) {
	super();
	System.out.println("2 args cons-----");
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public int getId() {
	System.out.println("get id-------");
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

}
