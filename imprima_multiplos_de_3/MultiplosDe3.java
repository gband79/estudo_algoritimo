
/*
Faça um programa em Java que imprima todos os múltiplos de 3, entre 1 e 100.
*/

//Lucas faz o favor tenta rodar aí. Não deu erro mas tb nume deu nenhum nada de retorno

public class MultiplosDe3
{
    
    public static void main(String[] args) 
    {
    	//descartar
    	//int numero = 100;
    	//descartar
    	
        int multiplosDe = 3; 
        for(int i=100; i>=1; i--)
        { 
        	System.out.println(i + " - " + (i % multiplosDe == 0));
            if(i % multiplosDe == 0)
            {
            	//Variavel numero e divis�o de numero n�o � preciso fazer dessa forma, pois precisamos mostar qual numero �
            	//divisivel por 3, no caso, a variavel definida I dentro do For � quem tera o numero atual ao percorrer
            	//e fazer a divis�o do numero, assim que ele for divisivel com um resto 0, ele ser� printado, e no mesmo for far�
            	//a decrementa��o (no caso a viariavel numero-- abaixo faria
            	//Exemplo 3 primeiras itera��es:
            	/*
            	 * 100 - false
					99 - true
					Multiplo de 3: 99
					98 - false
					97 - false
					96 - true
					Multiplo de 3: 96
					95 - false
					94 - false
					93 - true
					Multiplo de 3: 93
            	 */
            	
            	//descartar
            	//numero--;
                //numero /= multiplosDe;
            	//descartar 
            	
                System.out.println("Multiplo de 3: "+ i);
            }
        } 
    }
}