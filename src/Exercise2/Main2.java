package Exercise2;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire un numero intero");
        int numeroRicevuto = scanner.nextInt();
        switch(numeroRicevuto){
            case(0):
            System.out.println("Zero");
         break;
            case(1):
            System.out.println("Uno");
         break;
            case(2):
            System.out.println("Due");
         break;
            case(3):
            System.out.println("Tre");
         break;
            default : System.out.println("ERRORE");

    }
}}