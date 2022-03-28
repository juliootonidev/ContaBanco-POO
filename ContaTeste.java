package aula.poo.br;

import java.util.Scanner;

public class ContaTeste {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);//instancia criada a para Scanner

        Conta c1 = new Conta(); //instancia criada a partir da classe Conta
        ContaPoupa cP1 = new ContaPoupa(); //instancia criada a partir da classe ContaPoupanca
        ContaCorrente cC2 = new ContaCorrente(); //instancia criada a partir da classe ContaCorrente

        int op = 10;
        while  (op != 0) { // para sair do programa basta digitar 0 (zero)
            System.out.println("\n<1> Conta \n<2> Conta Poupança\n<3> Conta Corrente");
            op = sc.nextInt();
            if (op == 1) {
                System.out.println("\nImprime Conta: ");
                System.out.println("\nSaldo da conta:");
                c1.setSaldo(100);
                c1.atualizarSaldo(2);
                c1.imprimeConta();

            }else if (op == 2) {
                System.out.println("\nImprime Conta Poupanca: ");
                System.out.println("\nSaldo da conta: ");
                cP1.setSaldo(100);
                cP1.atualizarSaldo(2);
                cP1.imprimeContaPoupanca();
                System.out.println("Saldo Poupanca: " + cP1.getSaldo());

            }else if (op == 3) {
                System.out.println("\nImprime Conta Corrente: ");
                System.out.println("\nSaldo da conta: ");
                cC2.setSaldo(500);
                cC2.atualizarSaldo(0.05);
                System.out.println("Saldo Corrente: " + cC2.getSaldo());
                cC2.sacar(sc.nextDouble());
                System.out.println("Saldo Corrente depois do Saque: " + cC2.getSaldo());

            }
        }
    }
}