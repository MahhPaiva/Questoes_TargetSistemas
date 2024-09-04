package testetarget;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double faturamento[] = new double[5];
        double media=0, maiorValor=faturamento[1], menorValor=100000, cont=0, diasSupMedia=0;
        
        for(int i=1; i<5; i++){
            System.out.print("Informe o faturamento do dia " + i + ": ");
            faturamento[i] = Double.parseDouble(scanner.nextLine());
            if(faturamento[i]>maiorValor){
                maiorValor=faturamento[i];
            }
            if(faturamento[i] > 0){
                cont++;
                media=(media+faturamento[i])/cont;
                if(faturamento[i]>media){
                    diasSupMedia++;
                }
                if(faturamento[i]<menorValor){
                    menorValor=faturamento[i];
                }
            }
        }
        System.out.println("O menor valor de faturamento do mês foi: "+menorValor);
        System.out.println("O maior valor de faturamento do mês foi: "+maiorValor);
        System.out.println("O número de dias com faturamento superior a média do mês foi: "+diasSupMedia);
        
        scanner.close();
    }
}
