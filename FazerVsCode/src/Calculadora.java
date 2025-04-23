public class Calculadora {
    public static void main (String [] args) {
        Operadores op = new Operadores();

        System.out.println("O resultado da SOMA é " + op.adicao(10, 5));
        System.out.println("O resultado da SUBTRAÇÃO é " + op.subtracao(10, 5));
        System.out.println("O resultado da MULTIPLICAÇÃO é " + op.multiplicacao(10, 5));
        System.out.println("O resultado da DIVISÃO é " + op.divisao(10, 5));

        System.out.println("-------------");
        System.out.println("O resultado da ATRIBUIÇÃO SOMA é " + op.AtribuicaoMais(10, 5));
        System.out.println("O resultado da ATRIBUIÇÃO SUBTRAÇÃO é " + op.AtribuicaoMenos(10, 5));
        System.out.println("O resultado da ATRIBUIÇÃO MULTIPLICAÇÃO é " + op.AtribuicaoMultiplicacao(10, 5));
        System.out.println("O resultado da ATRIBUIÇÃO DIVISÃO é " + op.AtribuicaoDivisao(10, 5));

        System.out.println("-------------");
        System.out.println("O resultado da COMPARAÇÃO IGUAL é " + op.ComparacaoIgual(10, 5));
        System.out.println("O resultado da COMPARAÇÃO DIFERENTE é " + op.ComparacaoDiferente(10, 5));
        System.out.println("O resultado da COMPARAÇÃO MENOR é " + op.ComparacaoMenor(10, 5));
        System.out.println("O resultado da COMPARAÇÃO MAIOR é " + op.ComparacaoMaior(10, 5));
        System.out.println("O resultado da COMPARAÇÃO MENOR IGUAL é " + op.ComparacaoMenorIgual(10, 5));
        System.out.println("O resultado da COMPARAÇÃO MAIOR IGUAL é " + op.ComparacaoMaiorIgual(10, 5));

        System.out.println("-------------");
        System.out.println("O resultado LOGICO de && é " + op.LogicoEE(true, true));
        System.out.println("O resultado LOGICO de & é " + op.LogicoE(true, true));
        System.out.println("O resultado LOGICO de || é " + op.LogicoOUU(true, true));
        System.out.println("O resultado LOGICO de | é " + op.LogicoOU(true, true));
        System.out.println("O resultado LOGICO de ^  é " + op.Exclusivo(true, true));
        System.out.println("O resultado LOGICO de ! é " + op.Nao(true, true));


    }
}
