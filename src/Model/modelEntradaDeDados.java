package Model;

import java.util.Locale;
import java.util.Scanner;

public class modelEntradaDeDados {
    public void atividade1(){
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Escreva um programa que solicite ao usuário para digitar um número inteiro ");
        System.out.println("e armazene-o em uma variável. Em seguida, exiba o valor da variável na tela.");
        System.out.println();
        System.out.println();
        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();
        System.out.printf("O numero digitado foi: %d",numero);
        scanner.close();
    }

    public void atividade2(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.println("Escreva um programa que solicite ao usuário para digitar um número real ");
        System.out.println("e armazene-o em uma variável. Em seguida, exiba o valor da variável na tela.");

        System.out.println();
        System.out.println();

        System.out.print("Digite um numero real: ");
        numero = scanner.nextDouble();

        System.out.printf("O numero real digitado foi: %f ",numero);

        scanner.close();

    }

    public void atividade3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um programa que solicite ao usuário para digitar verdadeiro ou falso");
        System.out.println("e armazene-o em uma variável. Em seguida, exiba o valor da variável na tela");
        System.out.println();
        System.out.println();

        System.out.print("Digite verdadeiro ou falso: ");
        String entrada = scanner.nextLine().toLowerCase();
        boolean palavra = entrada.equals("verdadeiro");

        System.out.println("A palavra digitada foi : "+palavra);

        scanner.close();



    }

    public void atividade4(){
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Escreva um programa que solicite ao usuário para digitar um nome ");
        System.out.println("e armazene-o em uma variável. Em seguida, exiba o valor da variável na tela.");
        System.out.println();
        System.out.println();

        System.out.print("Digite um nome: ");
        nome = scanner.next();

        System.out.printf("O nome digitado foi %s ",nome);
        scanner.close();
    }

    public void atividade5(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double numeroReal;
        System.out.println("Escreva um programa que solicite ao usuário para digitar um número decimal ");
        System.out.println("e armazene-o em uma variável. Em seguida, exiba o valor da variável na tela");
        System.out.println();
        System.out.println();
        System.out.print("Digite um numero decimal: ");
        numeroReal = scanner.nextDouble();

        System.out.println("O numero decimal digitado foi: "+numeroReal);

        scanner.close();
    }


    public void atividade6(){
        Scanner scanner = new Scanner(System.in);
        int idade;
        String nome;
        System.out.println("Escreva um programa que solicite ao usuário para digitar o seu nome e a sua idade");
        System.out.println("e armazene-os em variáveis, respectivamente. Em seguida, exiba essas informações na tela.");

        System.out.println();
        System.out.println();
        System.out.print("Digite o seu nome: ");
        nome = scanner.next();
        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Seu nome e "+nome+"E sua idade e : "+idade);


    }

    public void atividade7(){
        Scanner scanner = new Scanner(System.in);
        String rua,bairro,cidade,estado;
        int numero;
        System.out.println("Escreva um programa que solicite ao usuário para digitar o seu endereço completo");
        System.out.println("incluindo o número da casa, rua, bairro, cidade e estado. Armazene cada informação ");
        System.out.println("em uma variável string e em seguida, exiba todas as informações juntas em uma única linha.");

        System.out.println();
        System.out.println();

        System.out.print("Digite o nome da Rua: ");
        rua = scanner.next();

        System.out.print("Digite o numero Casa: ");
        numero = scanner.nextInt();

        System.out.print("Digite o Bairro: ");
        bairro = scanner.next();

        System.out.print("Digite o nome da Cidade: ");
        cidade = scanner.next();

        System.out.print("Digite o nome do Estado: ");
        estado = scanner.next();

        System.out.println("Rua : "+rua+"Numero: "+numero+"Bairro: "+bairro+"Cidade"+cidade+"Estado"+estado);




    }


}
