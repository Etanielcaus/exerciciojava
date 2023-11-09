public class ParcelasDeCarro {
    public static void main(String[] args) {
        //Dado o valor de um carro, Descubra em quantas vezes ele pode
        // ser parcelado
        // Condicao valorDaParcela <= 1000;
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double resultado = valorCarro / parcela;
            if (resultado < 1000) {
                break;
            }
            System.out.println(resultado);
            System.out.println(parcela);
        }
    }
}
