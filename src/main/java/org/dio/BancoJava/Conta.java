package org.dio.BancoJava;

public class Conta implements ContaInterface{
    private static Integer NUM_SEQUENCIAL = 1;
    private Integer agencia;
    private Integer numero;
    private TipoConta tipoconta;
    private Banco banco;
    private Cliente cliente;


    public Conta (TipoConta tipoConta, Banco banco, Cliente cliente){
        this.numero = NUM_SEQUENCIAL++;
        this.tipoconta = tipoConta;
        this.agencia = banco.getAgencia();
        this.banco = banco;
        this.cliente = cliente;
    }

    private double saldo = 0;

    @Override
    public void sacar(double valor) {
        if(saldo>valor) saldo =-valor;
        else System.out.println("Saldo Insuficiente");
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta conta) {
        if(saldo>valor){
            this.sacar(valor);
            conta.depositar(valor);
            System.out.println("Transferencia realizada de " + valor + " para a conta de " + conta.cliente.getNome());
        }
        else System.out.println("Saldo Insuficiente");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo da conta do " + cliente.getNome() + " e " + saldo);
    }

    @Override
    public void getAgencia() {
        System.out.println("A agencia do " + cliente.getNome() + " e " + agencia);
    }

    @Override
    public void getBanco() {
        System.out.println("O banco do " + cliente.getNome() + " e " + banco.getNome());
    }
}
