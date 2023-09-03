package Exercicio03;

public class Funcionario {

    int Cracha;
    String Nome;
    String TipoVinculo;
    float ValorHora;
    float QtdHora;
    float Salario;
    float ValorDesconto;

    public int getCracha() {
        return Cracha;
    }

    public void setCracha(int cracha) {
        this.Cracha = cracha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getTipoVinculo() {
        return TipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        this.TipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return ValorHora;
    }

    public void setValorHora(float valorHora) {
        this.ValorHora = valorHora;
    }

    public float getQtdHora() {
        return QtdHora;
    }

    public void setQtdHora(float qtdHora) {
        this.QtdHora = qtdHora;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        this.Salario = salario;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.ValorDesconto = valorDesconto;
    }

    //CalcularSalario
    public float CalcularValorSalario() {
        if (TipoVinculo == "H") {
            return ValorHora * QtdHora - ValorDesconto;
        } else {
            return Salario - ValorDesconto;
        }
    }

    //Imprimir Stats
    public String Imprimir() {

        return "Menu \n" +
                "Cracha: \n" + Cracha +
                "Nome: \n" + Nome +
                "Vinculo: \n" + TipoVinculo +
                "ValorHora: \n" + ValorHora +
                "Quantidade de horas: \n" + QtdHora +
                "Salário: \n" + Salario +
                "Desconto: \n" + ValorDesconto;
    }

}
