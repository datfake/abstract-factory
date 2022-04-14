package builder;

import model.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float totalCost() {
        return (float) items.stream().mapToDouble(item -> item.price()).sum();
    }

    public void show() {
        items.forEach(item -> {
            System.out.println("--------------------");
            System.out.println("Name:" + item.name());
            System.out.println("Packing:" + item.packing().packing());
            System.out.println("Price:" + item.price());
        });
    }
}
