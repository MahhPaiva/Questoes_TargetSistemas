package testetarget;

public class Questao4 {
    public static void main(String[] args) {
        
        String estados[] = new String[5];
        double faturamento[] = new double[5];
        double percentual, total;
        
        estados[0] = "SP"; faturamento[0] = 67836.43;
        estados[1] = "RJ"; faturamento[1] = 36678.66;
        estados[2] = "MG"; faturamento[2] = 29229.88;
        estados[3] = "ES"; faturamento[3] = 27165.48;
        estados[4] = "Outros"; faturamento[4] = 19849.53;
        
        total = faturamento[0]+faturamento[1]+faturamento[2]+faturamento[3]+faturamento[4];
        
        for(int i=0; i<5; i++){
            percentual = faturamento[i]/total*100;
            System.out.println("Porcentagem de "+estados[i]+": "+percentual+"%");
        }
        
    }
}
