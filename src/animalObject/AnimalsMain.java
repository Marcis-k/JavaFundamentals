package animalObject;

import animalObject.Animals;

public class AnimalsMain {

    public static void main(String[] args) {

        Animals turtle = new Animals();

        turtle.height = 0.7f;
        turtle.weight = 120.5f;
        turtle.age = 120;
        turtle.color = "Brown";
        turtle.legCount = 4;
        turtle.isDomes = false;
        turtle.type = "Turtle";

        turtle.printAllInfo();
        turtle.birthYear();

    }
}
