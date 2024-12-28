package Domain;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a expressão matemática (ex: 5+3*2): ");
        String expressao = scanner.nextLine();

        calculadora.processExpression(expressao);

        try {
            double resultado = calculadora.calcular();
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
