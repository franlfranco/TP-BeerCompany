package edu.utn.beerCompany;

public class BeerConsumer extends Thread {
    private BeerHouse house;
    private String consumerName;

    public BeerConsumer(BeerHouse house, String consumerName) {
        super();
        this.house = house;
        this.consumerName = consumerName;
    }

    public BeerHouse getHouse() {
        return house;
    }

    public void setHouse(BeerHouse house) {
        this.house = house;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    @Override
    public void run() {
        while (house.getStock() != 0) {
            house.consumeStock(this.consumerName);
        }

        System.out.println(this.consumerName + " went home");
    }
}
