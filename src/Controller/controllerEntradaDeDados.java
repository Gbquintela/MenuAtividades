package Controller;

import Model.modelEntradaDeDados;
import View.telaAtividades;

import java.util.Scanner;

public class controllerEntradaDeDados {

        //Inicialização das pastas Model e Tela
        modelEntradaDeDados modelEntradaDeDados = new modelEntradaDeDados();
        telaAtividades telaEntradaDeDados = new telaAtividades();

        public void menuAtividades(){

            int opcaoEntradaDeDados;
            Scanner scanner = new Scanner(System.in);
            telaEntradaDeDados.entradadeDados();//Inicialização do Menu de atividade de Entrada de dados
            opcaoEntradaDeDados = scanner.nextInt();
            switch (opcaoEntradaDeDados){
                case 1 :
                    modelEntradaDeDados.atividade1();
                    break;
                case 2:
                    modelEntradaDeDados.atividade2();
                    break;

                case 3:
                    modelEntradaDeDados.atividade3();
                    break;
                case 4:
                    modelEntradaDeDados.atividade4();
                    break;
                case 5:
                    modelEntradaDeDados.atividade5();
                    break;
                case 6:
                    modelEntradaDeDados.atividade6();
                    break;
                case 7:
                    modelEntradaDeDados.atividade7();
                    break;
                default:
                    break;
            }


        }

    }
