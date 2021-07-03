import java.util.Scanner;

public class WordGame {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String x = scanner.toString();
        String x = "qwqdasd";

        System.out.println(solution(x));



    }
    public String solution (String stdIn){

        String stdOut;
        char[] by2 = new char[0];
        char[] by1 = new char[0];

        for(int i=0; i < stdIn.length(); i++){
            if(i == 0 || i % 2 == 0){
                by2[i] = (char) i;
            } else {
                by1[i] = (char) i;
            }
           // stdOut = Array.toString(by2) + "  " + Array.toString(by1);

        }
        return "Array.toString(by2) + \"  \" + Array.toString(by1)";
    }


}
