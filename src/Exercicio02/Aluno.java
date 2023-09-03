package Exercicio02;

public class Aluno {
    String Ra;
    String Nome;
    static float AC1;
    static float AC2;
    static float AG;
    static float AF;

    public String getRa() {
        return Ra;
    }

    public void setRa(String ra) {
        Ra = ra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getAC1() {
        return AC1;
    }

    public void setAC1(float AC1) {
        this.AC1 = AC1;
    }

    public float getAC2() {
        return AC2;
    }

    public void setAC2(float AC2) {
        this.AC2 = AC2;
    }

    public double getAG() {
        return AG;
    }

    public void setAG(float AG) {
        this.AG = AG;
    }

    public double getAF() {
        return AF;
    }

    public void setAF(float AF) {
        this.AF = AF;
    }

    public String imprimir() {
        return "Nome: " + Nome +
                "\nRA: " + Ra +
                "\nAC1: " + AC1 +
                "\nAC2:" + AC2 +
                "\nAG:" + AG +
                "\nAF:" + AF;
    }

    public static float calcularmedia() {
        return (float) ((AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45));
    }

    public static void VerificarMedia() {
        if (calcularmedia() >= 5) {
            System.out.println("Parábens,voce passou!");
        } else {
            System.out.println("Parábens,voce não passou!");
        }
    }

}
