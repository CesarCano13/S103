package n1exercici2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);

		ArrayList<Integer> a2 = new ArrayList<Integer>();

		ListIterator<Integer> it = a1.listIterator();

		while (it.hasNext()) {
			it.next();
		}

		while (it.hasPrevious()) {
			a2.add(it.previousIndex() + 1);
			it.previous();
		}

		System.out.println(a1);
		System.out.println("*******************************");
		System.out.println(a2);

	}

}
