package edu.utn.beerCompany;

public class BeerHouse {
    private String companyName;
    private int capacity;
    private int stock;

    public synchronized void addStock(String producer) {
        try {
            while(isFull()) {
                wait();
            }

            if(this.stock != 0) {
                this.stock ++;
                System.out.println(this.companyName
                        + " bought a beer from "
                        + producer
                        + " and has "
                        + stock
                        + " beers in stock");
            }

            notifyAll();
        } catch (InterruptedException e) {
            System.out.println(e + " got interrupted!");
        }
    }

    public synchronized void consumeStock(String consumerName) {
        if (this.stock != 0) {
            this.stock --;
            System.out.println(this.companyName
                    + " sold a beer to "
                    + consumerName
                    + " and has "
                    + stock
                    + " beers in stock");
        }

        notifyAll();
    }

    private boolean isFull() {
        return this.capacity == this.stock;
    }

    public BeerHouse(String companyName, int capacity, int stock) {
        this.companyName = companyName;
        this.capacity = capacity;
        this.stock = stock;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
