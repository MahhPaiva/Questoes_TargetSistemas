package testetarget;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String texto = "", textoInvertido = "";
        
        System.out.println("Informe o texto a ser invertido: ");
        texto = scanner.nextLine();

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido = textoInvertido + texto.charAt(i);
        }

        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);
    }
    
}
