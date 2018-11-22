package etec.com.br.etecapfqproapp;

/**
 * @Author: Napoleão Kazu Onaya
 * @Date: 3/11/2018
 * @Description: Classe de atributos dos botões do cardview
 */


public class Botoes {

    //Atributos do botão
    private int buttonFormulas;
    private int buttonRendimento;
    private int buttonExecesso;
    private int buttonLimitante;
    private int buttonInformacao;
    private int buttonDoacao;
    private int buttonPadornizacao;

    //Construtor sem parâmetros
    public Botoes() {
    }

    //Construtor com parâmetros
    public Botoes(int buttonFormulas, int buttonRendimento, int buttonExecesso, int buttonLimitante, int buttonInformacao, int buttonDoacao, int buttonPadornizacao) {
        this.buttonFormulas = buttonFormulas;
        this.buttonRendimento = buttonRendimento;
        this.buttonExecesso = buttonExecesso;
        this.buttonLimitante = buttonLimitante;
        this.buttonInformacao = buttonInformacao;
        this.buttonDoacao = buttonDoacao;
        this.buttonPadornizacao = buttonPadornizacao;
    }

    //Métodos Getter and Setter
    public int getButtonFormulas() {
        return buttonFormulas;
    }

    public void setButtonFormulas(int buttonFormulas) {
        this.buttonFormulas = buttonFormulas;
    }

    public int getButtonRendimento() {
        return buttonRendimento;
    }

    public void setButtonRendimento(int buttonRendimento) {
        this.buttonRendimento = buttonRendimento;
    }

    public int getButtonExecesso() {
        return buttonExecesso;
    }

    public void setButtonExecesso(int buttonExecesso) {
        this.buttonExecesso = buttonExecesso;
    }

    public int getButtonLimitante() {
        return buttonLimitante;
    }

    public void setButtonLimitante(int buttonLimitante) {
        this.buttonLimitante = buttonLimitante;
    }

    public int getButtonInformacao() {
        return buttonInformacao;
    }

    public void setButtonInformacao(int buttonInformacao) {
        this.buttonInformacao = buttonInformacao;
    }

    public int getButtonDoacao() {
        return buttonDoacao;
    }

    public void setButtonDoacao(int buttonDoacao) {
        this.buttonDoacao = buttonDoacao;
    }

    public int getButtonPadornizacao() {
        return buttonPadornizacao;
    }

    public void setButtonPadornizacao(int buttonPadornizacao) {
        this.buttonPadornizacao = buttonPadornizacao;
    }
}
