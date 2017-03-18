package generics;

import java.util.*;

class Dog {
	int size;

	Dog(int s) {
		size = s;
	}
}

public class FirstGrade {
	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<Integer>();
		TreeSet<Dog> d = new TreeSet<Dog>();

		d.add(new Dog(1));
		d.add(new Dog(2));
		d.add(new Dog(1));
		i.add(1);
		i.add(2);
		i.add(1);
		System.out.println(d.size() + " " + i.size());
	}
}