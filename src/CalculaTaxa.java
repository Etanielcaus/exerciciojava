public class CalculaTaxa {
    public static void main(String[] args) {
        double salarioAnualAlto = 30000;
        double salarioAnualMedio = 28000;
        double salarioAnualBaixo = 21000;

        double taxaAnual = 12;

        double resultadoAlto = (taxaAnual * salarioAnualAlto) / 100;
        double resultadoMedio = (taxaAnual * salarioAnualMedio) / 100;
        double resultadoBaixo = (taxaAnual * salarioAnualBaixo) / 100;

        System.out.println(resultadoAlto);
        System.out.println(resultadoMedio);
        System.out.println(resultadoBaixo);


        double salario = 69000;
        double taxa;

        if (salario < 34.712){
            taxa = 9.7;
        } else if (salario >= 34.713 && salario < 68507) {
            taxa = 37.55;
        } else {
            taxa = 49.50;
        }

        double resultado = (salario * taxa) / 100;
        System.out.println(resultado);
    }
}
