
/*
Make a Java program that prints all multiple numbers of 3, between 1 e 100.
*/

public class MultiplosDe3 {
    
    public static void main(String[] args) {
    	    	
        int divider = 3; 
        for(int i=100; i>=1; i--) { 
           
            if(i % divider == 0) {
                         
                System.out.println("Multiple of number 3: "+ i);
            } 
                        
        } 
    }
}