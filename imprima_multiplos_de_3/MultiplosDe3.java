
/*
Faça um programa em Java que imprima todos os múltiplos de 3, entre 1 e 100.
*/

//Lucas faz o favor tenta rodar aí. Não deu erro mas tb nume deu nenhum nada de retorno

public class MultiplosDe3
{
    
    public static void main(String[] args) 
    {
        int numero = 100;
        int multiplosDe = 3; 
        for(int i=100; i>=1; i--)
        { 
           
            if(numero % multiplosDe == 0)
            {
                         
                System.out.println("Multiplo de 3: "+ numero);
            } 
            
            
        } 
    }
}