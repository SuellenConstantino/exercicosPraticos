package com.java.metodos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercícios da Calculadora");
        Calculadora.soma(5, 6);
        Calculadora.subtracao(8, 50);
        Calculadora.multiplicacao(71, 10);
        Calculadora.divisao(15, 89);


        System.out.println("Exercício de Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem( 04);

        System.out.print("Exercício do Empréstimo");
        Emprestimo.calcular(3500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(3500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(3500, 5);

    }
}
