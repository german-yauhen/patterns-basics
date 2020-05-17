package com.herman.structural.adapter.figures;

public class AdapterRunner {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5.0);

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println(smallSquarePegAdapter.getRadius());
        System.out.println(largeSquarePegAdapter.getRadius());

        System.out.println(roundHole.doesFit(smallSquarePegAdapter));
        System.out.println(roundHole.doesFit(largeSquarePegAdapter));
    }
}
