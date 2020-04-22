package edu.utn;

import edu.utn.beerCompany.BeerConsumer;
import edu.utn.beerCompany.BeerHouse;
import edu.utn.beerCompany.BeerProducer;

public class Main {
    public static final int CAPACITY = 100;

    public static void main(String[] args) {
        BeerHouse beerHouse1 = new BeerHouse("Company1", CAPACITY, 10);
        BeerHouse beerHouse2 = new BeerHouse("Company2", CAPACITY, 20);

        Thread producer1 = new Thread(new BeerProducer(beerHouse1, "producer1"));
        Thread producer2 = new Thread(new BeerProducer(beerHouse2, "producer2"));

        BeerConsumer consumer1 = new BeerConsumer(beerHouse1, "consumer1");
        BeerConsumer consumer2 = new BeerConsumer(beerHouse1, "consumer2");

        BeerConsumer consumer3 = new BeerConsumer(beerHouse2, "consumer3");
        BeerConsumer consumer4 = new BeerConsumer(beerHouse2, "consumer4");

        producer1.start();
        producer2.start();

        consumer1.start();
        consumer2.start();

        consumer3.start();
        consumer4.start();
    }
}
