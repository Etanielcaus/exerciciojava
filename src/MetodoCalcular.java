public class MetodoCalcular {
    public int somar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }

    public static void main(String[] args) {
        MetodoCalcular minhaInstancia = new MetodoCalcular();
        int resultadoSoma = minhaInstancia.somar(5, 7);
        System.out.println("Resultado da soma: " + resultadoSoma);
    }
}
