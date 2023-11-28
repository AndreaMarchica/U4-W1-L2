package Exercise3;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Inserire una parola");
       // String parolaData = scanner.nextLine();

        do {  System.out.println("Inserire una parola");
              String parolaData = scanner.nextLine();}
        while (parolaData != ":q") {
           System.out.println("Inserire una parola");
           String parolaData2 = scanner.nextLine();
    }
}