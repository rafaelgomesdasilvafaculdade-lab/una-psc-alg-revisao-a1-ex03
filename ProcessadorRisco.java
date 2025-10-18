public class ProcessadorRisco {

    public static void main(String[] args) {
       
        int[] notasRisco = {
            85, 60, 92, 15, 77, 55, 88, 30, 45, 95,
            20, 65, 50, 80, 10
        }; 

        
        double somaPonderada = 0;
        int pesoTotal = 0;

        for (int i = 0; i < notasRisco.length; i++) {
            int nota = notasRisco[i];
            int peso;

            if (i >= 0 && i <= 4) { 
                peso = 3;
            } else { 
                peso = 1;
            }

            somaPonderada += nota * peso;
            pesoTotal += peso;
        }

        double mediaPonderada = somaPonderada / pesoTotal;

       
        int otimistas = 0;
        int alarmantes = 0;

        for (int nota : notasRisco) {
            if (nota <= 20) {
                otimistas++;
            }
            if (nota >= 90) {
                alarmantes++;
            }
        }

        
        System.out.println("--- Análise de Risco ---");
        System.out.println("Média Ponderada do Risco: " + String.format("%.2f", mediaPonderada));
        System.out.println("Analistas Otimistas (Nota <= 20): " + otimistas);
        System.out.println("Analistas Alarmantes (Nota >= 90): " + alarmantes);

        if (mediaPonderada > 70) {
            System.out.println("Parecer Final: Alto Risco: Venda ou reajuste de portfólio recomendado.");
        } else if (mediaPonderada >= 40 && mediaPonderada <= 70) {
            System.out.println("Parecer Final: Risco Moderado: Acompanhar de perto, mas manter os ativos.");
        } else {
            System.out.println("Parecer Final: Baixo Risco: Excelente momento para capitalização.");
        }
    }
}