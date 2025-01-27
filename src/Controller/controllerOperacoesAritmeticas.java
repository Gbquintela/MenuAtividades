package Controller;

import Model.modelOperacoesAritimeticas;
import View.telaAtividades;


public class controllerOperacoesAritmeticas {
        modelOperacoesAritimeticas modelOperacoes  = new modelOperacoesAritimeticas();
       telaAtividades telaOperacoes = new telaAtividades();

       public void menuOperacoes(){
        telaOperacoes.operacoesAritmeticas();
        modelOperacoes.atividade1();



       }
}
