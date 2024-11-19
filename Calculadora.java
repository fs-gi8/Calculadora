       import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Mostrar menú d'opcions
        System.out.println("La meua calculadora!");
        System.out.println("Quina operació vols fer:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicació");
        System.out.println("4. Divisió");
        System.out.print("Opció: ");
        
           //provetes de commits del
        
           int opcio = scanner.nextInt();
        
        // Sol·licitar els números a l'usuari
        System.out.print("Primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Segon número: ");
        double num2 = scanner.nextDouble(); double resultat = 0; // Variable per a emmagatzemar el resultat

        // Realitzar l'operació seleccionada
        switch (opcio) {
            case 1:
                resultat = num1 + num2;
                System.out.println("La suma és: " + resultat);
                break;
            case 2:
                resultat = num1 - num2;
                System.out.println("La resta és: " + resultat);
                break; case 3:
                resultat = num1 * num2;
                System.out.println("La multiplicació és: " + resultat);
                break;
            case 4:
                if (num2 != 0) {
                    resultat = num1 / num2;
                    System.out.println("La divisió és: " + resultat);
                } else {
                    System.out.println("Error: No es pot dividir per zero.");
                }
                break;
            default:
                System.out.println("Opció no vàlida.");
        }
        
        // Tancar l'escàner
        scanner.close();
    }
}
