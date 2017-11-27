import java.util.Scanner;
public class caesar {
//Ohjelma joka salaa/purkaa annetun tekstin Caesarin algoritmilla.
//Salausavaimena käytetään kysyttyä numeroa. 
//Program that encrypts/decrypts given string with Caesar's algorithm.
//Asked number is used as encryption key.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Press 1 if you want to encrypt, 2 if to decrypt
        System.out.println("Paina 1 jos haluat salata, 2 jos purkaa salauksen");
        int kumpi = s.nextInt();
        if (kumpi == 1) {
            kryptaus();
        }
        else if (kumpi == 2) {
            dekryptaus();
        }
        else {
            //I assume that you dont want to do either
            System.out.println("Oletan ettet halua tehdä kumpaakaan");
        }
    }
    public static void kryptaus() {
        Scanner s = new Scanner(System.in);
        //Give the plain text string
        System.out.println("Anna salattava lause");
        String lause = s.nextLine();
        //Give encryption key(number)
        System.out.println("Anna salausavain(numero)");
        int avain = s.nextInt();
        //Aakkoset tuplana jottei indeksi menisi yli, varmasti löytyy parempikin ratkaisu
        //Alphabet at double so that the index does not go over, there is definitely a better solution
        String abc = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String uusi = "";
        for (int i = 0; i <= lause.length() -1; i++) {
            char merkki = lause.charAt(i);
            int ix = abc.indexOf(merkki)+avain;
            char m = abc.charAt(ix);
            uusi = uusi + m;
        }
        System.out.println(uusi);
} 
    public static void dekryptaus() {
        Scanner s = new Scanner(System.in);
        //Give encrypted string
        System.out.println("Anna salattu lause");
        String lause = s.nextLine();
        //Give encryption key(number)
        System.out.println("Anna salausavain(numero)");
        int avain = s.nextInt();
        String abc = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String uusi = "";
        for (int i = 0; i <= lause.length() -1; i++) {
            char merkki = lause.charAt(i);
            int ix = abc.indexOf(merkki)-avain;
            char m = abc.charAt(ix);
            uusi = uusi + m;
        }
        System.out.println(uusi);
}
}
