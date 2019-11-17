package com.company;

import java.util.*;

public class task_6 {
    float backpack_spaciousness;

    task_6() {
        backpack_spaciousness = 1;
    }

    task_6(float bp_s) {
        backpack_spaciousness = bp_s;
    }

    public static void Task6() {
        Scanner in = new Scanner(System.in);
        System.out.print("Backpack spaciousness: ");
        float kg = in.nextFloat();
        task_6 bp = new task_6(kg);
        System.out.print("Number of items: ");
        int num = in.nextInt();
        Items[] items = new Items[num];
        for (int i = 0; i < items.length; i++) {
            int weight = 1 + (int) (Math.random() * 30);
            int cost = 1 + (int) (Math.random() * 30);
            items[i] = new Items(cost, weight);
        }
        for (int i = 0; i < items.length; i++) {
            System.out.println("Cost: " + items[i].item_cost + "\tWeight: " + items[i].item_weight);
        }
        Arrays.sort(items, Comparator.comparing(a -> Float.toString(a.getCoefficient())));
        Items count = new Items(0, 0);
        System.out.println("The items I put in the backpack:");
        for (int i = 0; i < items.length; i++) {
            if (count.item_weight + items[i].item_weight <= bp.backpack_spaciousness) {
                count.item_weight += items[i].item_weight;
                count.item_cost += items[i].item_cost;
                System.out.println("Cost: " + items[i].item_cost + "\tWeight: " + items[i].item_weight);
            }
        }
        System.out.println("Total cost: " + count.item_cost + "\nTotal weight: " + count.item_weight);
    }
}
