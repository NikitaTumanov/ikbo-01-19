package ru.mirea.pract08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
		WaitList<Integer> boundedWaitList = new BoundedWaitList<>(10);
		for (int i = 0; i < 10; i++) {
			boundedWaitList.add((int) (Math.random() * 100 + 1));
		}
		System.out.println(boundedWaitList);
		System.out.println("Содержит 0: " + boundedWaitList.contains(0));
		System.out.println("Пуст: " + boundedWaitList.isEmpty());
		List<Integer> test = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			test.add((int) (Math.random() * 100 + 1));
		}
		System.out.println("Содержит test-list: " + boundedWaitList.containsAll(test));
		System.out.println();

		UnfairWaitList<String> stringUnfairWaitList = new UnfairWaitList<>();
		System.out.println("UnfairWaitList пуст: " + stringUnfairWaitList.isEmpty());
		stringUnfairWaitList.add("Hello");
		stringUnfairWaitList.add("World");
		stringUnfairWaitList.add("!");
		System.out.println("UnfairWaitList пуст: " + stringUnfairWaitList.isEmpty());
		System.out.println("UnfairWaitList содержит \"Hello\": " + stringUnfairWaitList.contains("Hello"));
		System.out.println(stringUnfairWaitList);
		System.out.println(stringUnfairWaitList);
		stringUnfairWaitList.moveToBack("New");
		System.out.print(stringUnfairWaitList);
    }
}
