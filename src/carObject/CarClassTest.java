package carObject;

public class CarClassTest {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.author = "Rainis";
        book1.title = "Cela kaja";
        book1.setNumberOfPages(260);

        System.out.println(book1.author);
        System.out.println(book1.title);



       /*carObject.Car car1 = new carObject.Car();
        carObject.Car car2 = new carObject.Car();

        car1.setBrand("Opel");
        car1.setColor("Black");
        car1.setMaxSpeed(150);
        car1.printCarInfo();

        car2.setBrand("Mersedes");
        car2.setColor("Grey");
        car2.setMaxSpeed(290);
        car2.printCarInfo();
*/
    }



}
