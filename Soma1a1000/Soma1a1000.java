public class Soma1a1000{

	/*
	 * Enunciado:
	 * Fa�a um programa em Java que imprima a soma dos n�meros de 1 at� 1000.
	 */
	
    public static void main(String[] args) {
        int numero = 0;
        int somaDosNumeros = 0;
        for(int i=1; i<=1000; i++){
        	numero++;
            somaDosNumeros += numero;
        }
    System.out.println("A some dos numeros entre 1 e 1000 ate: "+somaDosNumeros);
    }
} 

