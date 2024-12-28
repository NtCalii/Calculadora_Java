package Domain;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    private ArrayList<Double> numeros;
    private ArrayList<Character> operadores;

    public Calculadora() {
        numeros = new ArrayList<>();
        operadores = new ArrayList<>();
    }

    public void adicionarNumero(double numero) {
        numeros.add(numero);
    }

    public void adicionarOperador(char operador) {
        operadores.add(operador);
    }

    public void processExpression(String expressao) {
        char[] chars = expressao.toCharArray();
        StringBuilder numberBuilder = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c) || c == '.') {
                numberBuilder.append(c);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (numberBuilder.length() > 0) {
                    adicionarNumero(Double.parseDouble(numberBuilder.toString()));
                    numberBuilder.setLength(0);
                }
                adicionarOperador(c);
            }
        }
        if (numberBuilder.length() > 0) {
            adicionarNumero(Double.parseDouble(numberBuilder.toString()));
        }
    }

    ///////////////////////////////////////////////////////

    public double calcular() {
        double resultado = numeros.get(0);
        for (int i = 0; i < operadores.size(); i++) {
            char operador = operadores.get(i);
            double proximoNumero = numeros.get(i + 1);
            switch (operador) {
                case '+':
                    resultado += proximoNumero;
                    break;
                case '-':
                    resultado -= proximoNumero;
                    break;
                case '*':
                    resultado *= proximoNumero;
                    break;
                case '/':
                    if (proximoNumero == 0) {
                        throw new ArithmeticException("Erro: Divisão por zero não é permitida!");
                    }
                    resultado /= proximoNumero;
                    break;
                default:
                    throw new IllegalArgumentException("Operador inválido");
            }
        }
        return resultado;
    }
}
