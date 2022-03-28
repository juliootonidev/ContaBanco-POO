package aula.poo.br;

public class ContaPoupa extends Conta {
    private double rendimento;
    private String dtAniversario;

    public ContaPoupa(){
        super(10, 0.00, 0, 0);
        this.rendimento = 0.00;
        this.dtAniversario = "00/00/0000";
    }
    public ContaPoupa(double rendimento, String dtAniversario){
        this.rendimento = rendimento;
        this.dtAniversario = dtAniversario;
    }
    public ContaPoupa(ContaPoupa cP){
        this.rendimento = cP.rendimento;
        this.dtAniversario = cP.dtAniversario;
    }
    public void imprimeContaPoupanca(){
        System.out.println("Rendimento: "+ this.rendimento);
        System.out.println("Data de Aniversario da Conta: "+ this.dtAniversario);
    }

    public void atualizarSaldo(double txPercentual) {
        super.atualizarSaldo((txPercentual*3));
    }

    public double getRendimento(){
        return rendimento;
    }
    public String getDtAniversario(){
        return dtAniversario;
    }
    public void setRendimento(double rendimento){
        this.rendimento = rendimento;
    }
    public void setDtAniversario(String dtAniversario){
        this.dtAniversario = dtAniversario;
    }
}
