package animalObject;

import java.time.Year;

public class Animals {

    public String type;
    public String color;
    public int legCount;
    public float weight;
    public int age;
    public float height;
    public boolean isDomes;

    public void printAllInfo() {
        System.out.println("Age - " + age);
        System.out.println("Type - " + type);
        System.out.println("Color - " + color);
        System.out.println("Leg Count - " + legCount);
        System.out.println("Weight  - " + weight);
        System.out.println("Height - " + height);
        System.out.println("Is domestic - " + isDomes);
    }

    //dzimsanas gadu  dzivniekam

    public void birthYear() {

        int yearNow = Year.now().getValue();
        System.out.println("Year of birth - " + (yearNow - age));

    }

}
