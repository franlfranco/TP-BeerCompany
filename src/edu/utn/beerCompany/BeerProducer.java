package edu.utn.beerCompany;

public class BeerProducer implements Runnable {
    private BeerHouse beerHouse;
    private String producerName;

    public BeerProducer(BeerHouse beerHouse, String producerName) {
        this.beerHouse = beerHouse;
        this.producerName = producerName;
    }

    public BeerHouse getBeerHouse() {
        return beerHouse;
    }

    public void setBeerHouse(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    @Override
    public void run() {
        while (beerHouse.getStock() != 0) {
            beerHouse.addStock(this.producerName);
        }

        System.out.println(this.producerName + " went home.");
    }
}
