package triangleObject;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;


    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    private boolean isValid(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        } else {
            return false;
        }
    }


    public double areaTriangle() {
        if (isValid(side1, side2, side3)) {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        double area = halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3);
        return Math.sqrt(area);
    } else {
        System.out.println("triangleObject.Triangle is not Valid");
        return 0;
    }
    }
}
