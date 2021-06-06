package pcObject;

public class CustumeCunstructors {
    public static void main(String[] args) {

        Pc pc1 = new Pc("Dell", 780.90f,512);
        Pc pc2 = new Pc();
        Pc pc3 = new Pc("Apple", 1028);


        pc1.pcInfo();
        System.out.println();
        pc2.pcInfo();
        System.out.println();
        pc3.pcInfo();

    }
}
