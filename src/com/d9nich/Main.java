package com.d9nich;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing MyHashSet:");
        timeIt(new MyHashSet<>());
        System.out.println("Testing ArrayList:");
        timeIt(new ArrayList<>());

    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private static void timeIt(Collection<Double> collection) {
        System.out.println("Adding numbers");
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
            collection.add(random.nextDouble() * 1_000_000);
        System.out.println("Time to add: " + (System.currentTimeMillis() - startTime) + "ms");

        System.out.println("Checking for number in collection:");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++)
            collection.contains(random.nextDouble() * 2_000_000);
        System.out.println("Time to check if contains: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
