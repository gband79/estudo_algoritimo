public class Soma1a1000{

	/*
	 * Enunciado:
	 * Make a java program that prints the sum  of numbers between 1 and 1000.
	 */
	
    public static void main(String[] args) {
        int numero = 1;
        int somaDosNumeros = 0;
        for(int i=1; i<=1000; i++){
        	numero++;
            somaDosNumeros += numero;
        }
    System.out.println("The sum of numbers between 1 and 1000 is: "+somaDosNumeros);
    }
} 

