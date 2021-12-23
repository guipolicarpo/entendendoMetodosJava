package dio.basecamp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício calculadora");
        Calculadora.soma(2, 3);
        Calculadora.divisao(6, 3);
        Calculadora.multiplicacao(5 ,4);
        Calculadora.subtracao(10, 7);

        System.out.println("Exercício mensagem");

        Mensagem.obterMensagem(3);
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(20);

        System.out.println("Exercício Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        System.out.println("Exercício Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5, 5);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);
    }
}
