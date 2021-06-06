package carObject;

public class Car {

    private String brand;
    private String color;
    private int maxSpeed;

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }

    public String getBrand(){
        return brand;
    }

    public void printCarInfo(){
        System.out.println("carObject.Car brand " + brand);
        System.out.println("carObject.Car color " + color);
        System.out.println("carObject.Car max speed " + maxSpeed);
    }



}
