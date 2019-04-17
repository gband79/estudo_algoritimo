/*
A Citizen can only vote if he is not under sixteen and he is a brazilian citizen.
Create a program with two variables: int age, boolean brazilian and make the program to
say if the citizen is eligeble for voting or not, according with variable data.

*/

public class Citizen{

    int age = 18;
    boolean brazilian = true;
    
    public static void main(String[] args) {
        if(age > 16 && brazilian == true){
            System.out.println("eligeble for voting");
       

        } else{
            System.out.println("Not eligible for voting");
        }
    }
}

 //não entendi pq não posso atribuir uma variavel não estática a um contexto estático
        /*
        Error:
        /Citizen.java:7: error: non-static variable age cannot be referenced from a static context
        if(age > 16 && brazilian == true){
           ^
/Citizen.java:7: error: non-static variable brazilian cannot be referenced from a static context
        if(age > 16 && brazilian == true){
                       ^
2 errors
        */