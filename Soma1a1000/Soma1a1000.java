import java.util.Scanner;

public class Soma1a1000{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 1;
        int somaDosNumeros = 0;
        for(int i=1; i<=1000; i++){
            numero = scan.nextInt();
            somaDosNumeros += numero;
        }
    
    scan.close();
    System.out.println("A some dos números entre 1 e 1000 dá: "+somaDosNumeros);
    }
} 