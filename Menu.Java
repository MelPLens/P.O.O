package poo;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[]args){
        
            int opcao=0;
            Pessoa p = new Pessoa();
            Scanner teste = new Scanner (System.in);
            while(opcao !=3){
      System.out.println("Menu:");
      System.out.println("1- Criar pessoa");
      System.out.println("2 - Mostrar pessoa");
      System.out.println("3 - Sair");
      System.out.println("Escolha a opcao desejada:");
      opcao = Integer.parseInt(teste.nextLine());
     
      System.out.println("Digite o Cpf");
                  p.setCpf(teste.nextLine());
                  
                  switch (opcao) {
                case 1:
                    //1 - Criar Pessoa
                    System.out.println("Digite o CPF");
                    p.setCpf(teste.nextLine());
                    System.out.println("Digite o nome");
                    p.setNome(teste.nextLine());

                    break;
                case 2:
                    //2 - Mostrar Pessoa
                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("O sistema será fechado");
                    break;
                default:
                    System.out.println("Opção Inválida");
          
          
      }
      
      
}
            teste.close(); // pegar informacao do usuario
}
}

