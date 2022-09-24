package collectionsHw3;

import java.util.*;

public class Person implements Comparable {
	private final String name;
	private final String surName;
	private ArrayList<String> address;
	private ArrayList<Integer> phone;

	public Person(String name, String surName, ArrayList<String> address, ArrayList<Integer> phone) {
		this.name = name;
		this.surName = surName;
		this.address = address;
		this.phone = phone;
	}

	public ArrayList<String> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}

	public ArrayList<Integer> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Integer> phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	@Override
	public int compareTo(Object o) {
		Person person1 = (Person) o;
		return surName.compareTo(person1.surName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name, phone, surName);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surName=" + surName + ", adres=" + address + ", phone=" + phone + "]";
	}

}
