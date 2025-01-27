package Model;

import java.util.Locale;
import java.util.Scanner;

public class modelOperacoesAritimeticas {


    public void atividade1(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double peso;
        double altura;
        double massaCorporal;
        System.out.println("Escreva um programa que solicite ao usuário seu peso (em kg) ");
        System.out.println("e altura (em metros) e calcule o Índice de Massa Corporal (IMC).");

        System.out.print("Digite o seu peso em kg : ");
        peso = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        altura = scanner.nextDouble();


        massaCorporal = peso * ( altura * altura);

        System.out.println("Seu Indice de Massa Corportal  e: " + massaCorporal);

    }


    public void atividade2(){






    }

}
