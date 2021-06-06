package pcObject;

public class Pc {
    private String brand;
    private float price;
    private int storage;

    public Pc(String brand, float price, int storage) {   //Konstruktors custome
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }

    public Pc(){

    }

    public Pc(String brand,int storage){
        this.brand=brand;
        this.storage=storage;
    }

    public void pcInfo() {
        System.out.println("Pc info:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Storage: " + storage);
    }


}
