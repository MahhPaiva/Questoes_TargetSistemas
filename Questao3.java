package testetarget;

public class Questao3 {
    public static void main(String[] args) {
        double faturamento[] = new double[31];
        double media=0, maiorValor=faturamento[1], menorValor=100000, cont=0, diasSupMedia=0;

        faturamento[1] = 22174.1664;
        faturamento[2] = 24537.6698;
        faturamento[3] = 26139.6134;
        faturamento[4] = 0;
        faturamento[5] = 0;
        faturamento[6] = 26742.6612;
        faturamento[7] = 0;
        faturamento[8] = 42889.2258;
        faturamento[9] = 46251.174;
        faturamento[10] = 11191.4722;
        faturamento[11] = 0;
        faturamento[12] = 0;
        faturamento[13] = 3847.4823;
        faturamento[14] = 373.7838;
        faturamento[15] = 2659.7563;
        faturamento[16] = 48924.2448;
        faturamento[17] = 18419.2614;
        faturamento[18] = 0;
        faturamento[19] = 0;
        faturamento[20] = 35240.1826;
        faturamento[21] = 43829.1667;
        faturamento[22] = 18235.6852;
        faturamento[23] = 4355.0662;
        faturamento[24] = 13327.1025;
        faturamento[25] = 0;
        faturamento[26] = 0;
        faturamento[27] = 25681.8318;
        faturamento[28] = 1718.1221;
        faturamento[29] = 13220.495;
        faturamento[30] = 8414.61;
        
        for(int i=1; i<=30; i++){
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
    }
}
