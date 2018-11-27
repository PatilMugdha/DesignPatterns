package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Item;

public class Meal {
	private List<Item> items = new ArrayList<Item>();
	float cost = 0;

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {

		for (Item item : items) {
			System.out.println("Item name - " + item.name());
			System.out.println("Item type of packing - " + item.packing().pack());
			System.out.println("Item price - " + item.price());
		}
	}
}
