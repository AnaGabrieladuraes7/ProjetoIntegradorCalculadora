package org.example;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return (double) a / b;
    }

    public int somar(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public int subtrair(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public int multiplicar(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }
        int resultado = 1;
        for (int num : numeros) {
            resultado *= num;
        }
        return resultado;
    }

    public double dividir(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                throw new ArithmeticException("Divisão por zero não autorizada");
            }
            resultado /= numeros[i];
        }
        return resultado;
    }
}
