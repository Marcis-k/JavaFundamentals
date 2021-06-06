package triangleObject;

public class TriangleMain {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();

        triangle1.setSide1(17);
        triangle1.setSide2(39);
        triangle1.setSide3(44);

        System.out.println(triangle1.areaTriangle());
    }
}
