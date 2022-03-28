package aula.poo.br;

public class ContaCorrente extends Conta{
    private double limite;
    private double tarifaServico;
    private double txBancaria = 1;

    public ContaCorrente(){
        super(11, 0.00, 0, 0);
        this.limite = 0.00;
        this.tarifaServico = 0.00;
    }
    public ContaCorrente(double limite, double tarifaServico){
        this.limite = limite;
        this.tarifaServico = tarifaServico;
    }
    public ContaCorrente(ContaCorrente cC){
        limite = cC.limite;
        tarifaServico = cC.tarifaServico;
    }
    public void atualizarSaldo(double txPercentual) {
        super.atualizarSaldo(txPercentual*-2);
    }

    public void sacar(double saque) {
        super.sacar(saque + txBancaria);
    }

    public void imprimeContaCorrente(){
        System.out.println("Limite: "+ this.limite);
        System.out.println("Tarifa do Servico: "+ this.tarifaServico);
    }

    public double getLimite(){
        return limite;
    }
    public double getTarifaServico(){
        return tarifaServico;
    }
    public double getTxBancaria() {
        return txBancaria;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    public void setTarifaServico(double tarifaServico){
        this.tarifaServico = tarifaServico;
    }
    public void setTxBancaria(double txBancaria) {
        this.txBancaria = txBancaria;
    }
}
