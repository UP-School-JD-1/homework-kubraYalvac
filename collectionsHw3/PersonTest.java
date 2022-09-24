//Course2 Chapter9 Collections Hw3

package collectionsHw3;

import java.util.*;

public class PersonTest {
	public static void main(String[] args) {

		ArrayList<String> address = new ArrayList<String>();
		address.add("Istanbul");

		ArrayList<String> address1 = new ArrayList<String>();
		address1.add("Roma");

		ArrayList<String> address2 = new ArrayList<String>();
		address2.add("Dublin");

		ArrayList<String> address3 = new ArrayList<String>();
		address3.add("New York");

		ArrayList<Integer> phone = new ArrayList<Integer>();
		phone.add((Integer) 905531345);

		ArrayList<Integer> phone1 = new ArrayList<Integer>();
		phone1.add((Integer) 390542156);

		ArrayList<Integer> phone2 = new ArrayList<Integer>();
		phone2.add((Integer) 353124568);

		ArrayList<Integer> phone3 = new ArrayList<Integer>();
		phone3.add((Integer) 1516245883);

		Person p1 = new Person("Kubra", "Yalvac", address, phone);
		Person p2 = new Person("Alessa", "Ramola", address1, phone1);
		Person p3 = new Person("Aaron", "Alvy", address2, phone2);
		Person p4 = new Person("Robin", "Mosby", address3, phone3);
		//Person p5 = new Person("Nida", "Kale", address3, phone3);

		TreeSet<Person> person = new TreeSet<>();
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		//person.add(p5);

		person.comparator();
		person.forEach(person4 -> System.out.println(person4.getSurName()));

		System.out.println("----------------");

		Iterator<Person> i = person.iterator();
		while (i.hasNext()) {

			Person per = (Person) i.next();
			System.out.println(per.getName() + " " + per.getSurName() + " " + per.getAddress() + " " + per.getPhone());

		}
	}
}
