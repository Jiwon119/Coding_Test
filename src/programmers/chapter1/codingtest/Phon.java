package programmers.chapter1.codingtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Phon {
	
	private static class PhoneNumber{
		public final String phoneNumber;
		
		public PhoneNumber(String rawPhoneNumber) {
			this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");
		}
		@Override
		public boolean equals(Object o) {
			if(!(o instanceof PhoneNumber)) return false;
			return phoneNumber.equals(((PhoneNumber) o).phoneNumber);
		}
		@Override
		public String toString() {
			return "phoneNumber='" + phoneNumber + '\'';
		}
	}
	
	private static class Person{
		public final String name;
		private final List<PhoneNumber> numbers;
		
		public Person(String name) {
			this.name = name;
			numbers = new ArrayList<>();
		}
		private void addPhoneNumber(PhoneNumber number) {
			numbers.add(number);
		}
		private boolean hasPhoneNumber(PhoneNumber number) {
			return numbers.contains(number);
		}
		@Override
		public String toString() {
			return "Person{ " + 
					"name= " + this.name + 
					", phoneNumber= " + this.numbers +
					" }";
		}

	}
	private static class PhoneBook{
		private static Set<Person> people;
		
		private PhoneBook() {
			people = new HashSet<>();
		}
		
		private static void addPerson(Person person) {
			people.add(person);			
		}
		
		public Person search(PhoneNumber number) {
			return people.stream()
					.filter(p -> p.hasPhoneNumber(number))
					.findFirst()
					.orElse(null);
		}
		
		@Override
		public String toString() {
			return "PhoneBook{ " + 
					"people= " + people + 
					" }";
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
//		System.out.println(new PhoneNumber("010-1234-5678"));
//		System.out.println(new PhoneNumber("010 1234 5678"));
//		System.out.println(new PhoneNumber("01012345678"));
		
		Person jw = new Person("김지원");
		jw.addPhoneNumber(new PhoneNumber("010-1234-5678"));
		jw.addPhoneNumber(new PhoneNumber("010-2222-6568"));
		
		Person p1 = new Person("김지윤");
		p1.addPhoneNumber(new PhoneNumber("010-3333-6568"));
		
		Person p2 = new Person("김예진");
		p2.addPhoneNumber(new PhoneNumber("010-5555-6568"));
		
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.addPerson(jw);
		phoneBook.addPerson(p1);
		phoneBook.addPerson(p2);
		
//		System.out.println(phoneBook);
		
		System.out.println(phoneBook.search(new PhoneNumber("010-1234-5678")));
		System.out.println(phoneBook.search(new PhoneNumber("010-2222-6568")));
		System.out.println(phoneBook.search(new PhoneNumber("010-3333-6568")));
		System.out.println(phoneBook.search(new PhoneNumber("010-3333-3333")));
		
//		System.out.println(jw.hasPhoneNumber(new PhoneNumber("010-1234-5677")));		
//		System.out.println(jw);
		
		
		
	}
}
