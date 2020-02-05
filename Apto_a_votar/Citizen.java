import java.util.Scanner;

/*
A Citizen can only vote if he is not under sixteen and he is a brazilian citizen.
Create a program with two variables: int age, boolean brazilian and make the program to
say if the citizen is eligeble for voting or not, according with variable data.

*/

public class Citizen{
    public static void main(String[] args) {
        
				
		Scanner entrada = new Scanner(System.in);

        System.out.println("Insert your age:");
        int age = entrada.nextInt();

        System.out.println("Are you brazilian?");
        String nationality = entrada.next();

        if(age >= 16 && nationality.equalsIgnoreCase("yes")) {
            
        	System.out.println("You are eligeble for voting in brazil!");
            
        }else if(age >= 16 && nationality.equalsIgnoreCase("no")) {
            
        	System.out.println("You are not eligeble for voting in Brazil.");
        
        }else if(age < 16 && nationality.equalsIgnoreCase("yes")) {
            System.out.println("You are not eligeble for voting in Brazil.");
        
        }else if(age < 16 && nationality.equalsIgnoreCase("no")) {
        	System.out.println("You are not eligeble for voting in Brazil.");
        } 	                    
               
        entrada.close();
	}
}

