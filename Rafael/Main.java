public class Main {

    public static int calcular(FazerConta om, int num1, int num2) {
        return om.executar(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println("30 + 30 = " + calcular(new Somar(), 30, 30));
        System.out.println("50 - 10 = " + calcular(new Subtrair(), 50, 10));
    }

}