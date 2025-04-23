public class Operadores {
    public float adicao(float v1, float v2) {
        return v1 + v2;
    }

    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2) {
        return v1*v2;
    }

    public float divisao(float v1, float v2) {
        if (v2 == 0) {
            System.out.println("Não pode dividir por 0");
        }
        return v1/v2;
    }

    public float AtribuicaoMais(float v1, float v2) {
        return v1 += v2;
    }

    public float AtribuicaoMenos(float v1, float v2) {
        return v1 -= v2;
    }

    public float AtribuicaoMultiplicacao(float v1, float v2) {
        return v1 *= v2;
    }

    public float AtribuicaoDivisao(float v1, float v2) {
        return v1 /= v2;
    }

    public float AtribuicaoSimples(float v1, float v2) {
        return v1 = v2;
    }

    public boolean ComparacaoIgual (float v1, float v2) {
        return v1 == v2;
    }

    public boolean ComparacaoDiferente (float v1, float v2) {
        return v1 != v2;
    }
    
    public boolean ComparacaoMenor (float v1, float v2) {
        return v1 < v2;
    }

    public boolean ComparacaoMaior(float v1, float v2) {
        return v1 > v2;
    }

    public boolean ComparacaoMenorIgual (float v1, float v2) {
        return v1 <= v2;
    }

    public boolean ComparacaoMaiorIgual (float v1, float v2) {
        return v1 >= v2;
    }

    public boolean LogicoEE (boolean v1, boolean v2) {
        return v1 && v2;
    }

    public boolean LogicoE (boolean v1, boolean v2) {
        return v1 & v2;
    }

    public boolean LogicoOUU (boolean v1, boolean v2) {
        return v1 || v2;
    }

    public boolean LogicoOU (boolean v1, boolean v2) {
        return v1 | v2;
    }

    public boolean Exclusivo (boolean v1, boolean v2) {
        return v1 ^ v2;
    }

    public boolean Nao (boolean v1, boolean v2) {
        return !v1;
    }
}
