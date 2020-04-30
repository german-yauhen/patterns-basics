package com.herman.behavior.iterator;

import java.util.Iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        BikeRepository bikeRepository = new BikeRepository();
        bikeRepository.addBike("Kolobike");
        bikeRepository.addBike("Solobike");
        bikeRepository.addBike("Polubike");

        bikeRepository.iterator().forEachRemaining(System.out::println);

        for (String bike : bikeRepository) {
            System.out.println(bike);
        }

        Iterator<String> newIterator = bikeRepository.iterator();
        while (newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }
    }
}
