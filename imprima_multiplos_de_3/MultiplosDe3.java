
/*
FaÃ§a um programa em Java que imprima todos os mÃºltiplos de 3, entre 1 e 100.
*/

//Lucas faz o favor tenta rodar aÃ­. NÃ£o deu erro mas tb nume deu nenhum nada de retorno

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
<<<<<<< HEAD
           
            if(numero % multiplosDe == 0)
            {
                         
                System.out.println("Multiplo de 3: "+ numero);
            } 
            
            
=======
        	//Descomentar na linha abaixo para poder ver qual momento ele entra na condicao IF
        	//System.out.println(i + " - " + (i % multiplosDe == 0));
            if(i % multiplosDe == 0)
            {
            	//Variavel numero e divisão de numero não é preciso fazer dessa forma, pois precisamos mostar qual numero é
            	//divisivel por 3, no caso, a variavel definida I dentro do For é quem tera o numero atual ao percorrer
            	//e fazer a divisão do numero, assim que ele for divisivel com um resto 0, ele será printado, e no mesmo for fará
            	//a decrementação (no caso a viariavel numero-- abaixo faria
            	//Exemplo 3 primeiras iterações:
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
>>>>>>> ac1cc2a7cf6d52bffd5de8d824683868610a4d25
        } 
    }
}