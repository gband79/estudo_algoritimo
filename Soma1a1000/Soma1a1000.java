public class Soma1a1000{

    public static void main(String[] args) {
        int numero = 1;
        int somaDosNumeros = 0;
        for(int i=1; i<=1000; i++){
            somaDosNumeros += numero;
            numero++;
        }
    
    System.out.println("A some dos numeros entre 1 e 1000 ate: "+somaDosNumeros);
    }
} 