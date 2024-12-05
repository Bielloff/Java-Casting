public class CastingExemplo {
    public static void main(String[] args) {
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble;
        System.out.println("Valor original (double): " + valorDouble);
        System.out.println("Valor após casting explícito (int): " + valorInt);

        int outroValorInt = 5;
        double outroValorDouble = outroValorInt;
        System.out.println("Valor original (int): " + outroValorInt);
        System.out.println("Valor após casting implícito (double): " + outroValorDouble);
    }
}