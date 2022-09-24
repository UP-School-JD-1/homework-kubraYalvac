//Course2 Chapter9 Collections Hw3

package collectionsHw3;

import java.util.*;

public class PersonTest {
	public static void main(String[] args) {

		ArrayList<String> address1 = new ArrayList<String>();
		address1.add("Istanbul");

		ArrayList<String> address2 = new ArrayList<String>();
		address2.add("Roma");

		ArrayList<String> address3 = new ArrayList<String>();
		address3.add("Dublin");

		ArrayList<String> address4 = new ArrayList<String>();
		address4.add("New York");

		ArrayList<Integer> phone1 = new ArrayList<Integer>();
		phone1.add((Integer) 905531345);

		ArrayList<Integer> phone2 = new ArrayList<Integer>();
		phone2.add((Integer) 390542156);

		ArrayList<Integer> phone3 = new ArrayList<Integer>();
		phone3.add((Integer) 353124568);

		ArrayList<Integer> phone4 = new ArrayList<Integer>();
		phone4.add((Integer) 1516245883);

		Person p1 = new Person("Kubra", "Yalvac", address1, phone1);
		Person p2 = new Person("Alessa", "Ramola", address2, phone2);
		Person p3 = new Person("Aaron", "Alvy", address3, phone3);
		Person p4 = new Person("Robin", "Mosby", address4, phone4);

		TreeSet<Person> person = new TreeSet<>();
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);

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
