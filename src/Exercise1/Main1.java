package Exercise1;

public class Main1 {

    public static void main(String[] args) {
        String parola = "ciaoo";
        if (stringaPariDispari(parola)) {
            System.out.println("La parola"+ " " +  parola + " " + "è pari");
        } else System.out.println("La parola"+ " " +  parola + " " + "è dispari");

        int anno = 2021;
        if(annoBisestile(anno)){
            System.out.println("L'anno"+ " " +  anno + " " + "è bisestile");
        } else System.out.println("L'anno"+ " " +  anno + " " + "non è bisestile");
    }
    public static boolean stringaPariDispari(String s)
       {System.out.println(s.length()%2 == 0);
        return s.length()%2 == 0;
       }

     public static boolean annoBisestile(int n){
        return n % 4 == 0;
    }
}