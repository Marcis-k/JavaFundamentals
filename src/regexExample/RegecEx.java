package regexExample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegecEx {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("{1,10}");
//        Matcher matcher = pattern.matcher("3");
//
//        System.out.println(matcher.matches());
        Scanner scanner=new Scanner(System.in);
        System.out.println("insert car number plate number: ");
        String n = scanner.next();

        System.out.println("Car: " + carNumberPlate(n));

        System.out.println("Person: " + personID("12345243432"));


    }

    private static boolean personID(String n) {
        Pattern pattern = Pattern.compile("[0-9]{6}-?[0-9]{5}");
        Matcher matcher = pattern.matcher(n);
        return matcher.matches();
    }

    private static boolean carNumberPlate(String n) {
        Pattern pattern = Pattern.compile("[a-zA-Z]{2}-?[0-9]{4}");     //-? lai varetu gan kad ir gan nav zime
        Matcher matcher = pattern.matcher(n);
        return matcher.matches();
    }
}
