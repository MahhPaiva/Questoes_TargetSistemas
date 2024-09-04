package testetarget;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num_i, num_s=0, num2=1, prox;
        
        System.out.print("Informe um número: ");
        num_i = Integer.parseInt(scanner.nextLine());
        
        while(true){
            if(num_s < num_i){
                prox=num_s+num2;
                num_s=num2;
                num2=prox;
                }
            else{
                if(num_i == num_s){
                    System.out.println("Pertence a sequência!");
                    break;
                }
                else{
                    System.out.println("NÃO pertence a sequência!");
                    break;
                }
            }
        }
        
        scanner.close();
       
    }
}
