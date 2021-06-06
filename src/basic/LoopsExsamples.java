package basic;

import java.util.Scanner;

public class LoopsExsamples {
    public static void main(String[] args) {

//        for (int i = 0; i <10;i++){
//            System.out.println("hello world");
//        }
//
//        for (int i =1 ; i<=10;i++){
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ievadiet skaitli");
//        int input = scanner.nextInt();
//
//        for (int i = input; i >=1 ; i--){
//            System.out.println(i);
//        }

//        for (int i = 0 ; i < 10;i++){
//
//            if(i ==1){
//                System.out.println("Ha ha 1");
//                continue;
//            }System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli");
        int input = scanner.nextInt();

//        for (int i = 0; i <= input; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//                continue;
//            }
//        }



//        int i = 0;
//        while (i <= input){
//
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }


        int i = 0;
        int counter=0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
            counter++;
        } while (i <= input);
        System.out.println("counter times - "+counter);

    }
}
