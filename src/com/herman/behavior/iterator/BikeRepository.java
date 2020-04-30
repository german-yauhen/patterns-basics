package com.herman.behavior.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private static final int DEFAULT_CAPACITY = 16;

    private String[] bikes;
    private int currentIndex;


    public BikeRepository() {
        this.bikes = new String[DEFAULT_CAPACITY];
        this.currentIndex = 0;
    }

    public BikeRepository(int capacity) {
        this.bikes = new String[capacity];
        this.currentIndex = 0;
    }

    public void addBike(String bike) {
        if (currentIndex == bikes.length) {
            String[] bikesIncreased = new String[DEFAULT_CAPACITY + 8];
            System.arraycopy(bikes, 0, bikesIncreased, 0, bikes.length);
            bikes = bikesIncreased;
            bikesIncreased = null;
        }
        bikes[currentIndex] = bike;
        currentIndex++;
    }

    /**
     * Contains simple implementation just for the study purpose
     */
    @Override
    public Iterator<String> iterator() {

        Iterator<String> iterator = new Iterator<String>() {

            private int currentPosition = 0;

            @Override
            public boolean hasNext() {
                return bikes != null && bikes.length > 0
                        && currentPosition < bikes.length && bikes[currentPosition] != null;
            }

            @Override
            public String next() {
//                String bike = bikes[currentPosition];
//                currentPosition++;
//                return bike;
                return bikes[currentPosition++];
            }
        };
        return iterator;
    }
}
