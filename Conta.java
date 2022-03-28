package aula.poo.br;

public class Conta {
    private int idConta;
    private double saldo;
    private int qtDepositos;
    private int qtSaques;

    public Conta() {
        // construtor da classe Conta
        idConta = 0;
        saldo = 0.00;
        qtDepositos = 0;
        qtSaques = 0;
    }
    public Conta(int idConta, double saldo, int qtDepositos, int qtSaques){
        /* construtor com par�metros */
        this.idConta = idConta;
        this.saldo = saldo;
        this.qtDepositos = qtDepositos;
        this.qtSaques = qtSaques;
    }
    public Conta(Conta c){
        /*Copia de Construtor */
        idConta = c.idConta;
        saldo = c.saldo;
        this.qtDepositos = c.qtDepositos;
        this.qtSaques = c.qtSaques;
    }

    //get e set
    public int getIdConta(){
        return idConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public int getQtDepositos(){
        return qtDepositos;
    }
    public int getQtSaques(){
        return qtSaques;
    }
    public void setIdConta(int idConta){
        this.saldo = idConta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setQtDepositos(int qtDepositos){
        this.qtDepositos = qtDepositos;
    }
    public void setQtSaques(int qtSaques){
        this.qtSaques = qtSaques;
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
        qtDepositos++;
    }
    public void sacar(double saque) {
        this.saldo -= saque;
        qtSaques++;
    }

    public void atualizarSaldo(double txPercentual) {
        this.saldo += saldo * txPercentual;
    }

    public void imprimeConta(){
        System.out.println("Identificador da Conta:"+ this.idConta);
        System.out.println("Saldo:"+ this.saldo);
        System.out.println("Quantidade de Depositos:"+ this.qtDepositos);
        System.out.println("Quantidade de Saques:"+ this.qtSaques);
    }
}