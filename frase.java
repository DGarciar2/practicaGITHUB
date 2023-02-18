import java.util.Scanner;

public class frase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        System.out.print("Frase: ");
    
        String f = entrada.next();

        System.out.print("Caràcter: ");

        String c = entrada.next();
       
        
        
        if (f.contains((c))) {
        	String newString = f.replace(c, "*");
            System.out.println("Sortida: " + newString);
        } else {
            System.out.println("El caràcter no existeix.");
        }
        
        

        

        
    } 
}
