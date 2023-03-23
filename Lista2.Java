//Exercicio 01

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // colocar atributos
        public
            
            
        do {
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");

            opcao = scanner.nextInt();
            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = somar(num1, num2);
                    break;
                case 2:
                    resultado = subtrair(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4
