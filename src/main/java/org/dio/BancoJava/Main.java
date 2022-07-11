package org.dio.BancoJava;

public class Main {
    public static void main(String[] args) {
        Cliente Carlos = new Cliente("Carlos");
        Cliente Maria = new Cliente("Maria");

        Banco Santander = new Banco("Santander-Rondon");
        Conta contaDoCarlos = Santander.criarConta(TipoConta.CONTA_CORRENTE, Carlos);
        Conta contaDaMaria = Santander.criarConta(TipoConta.CONTA_CORRENTE, Maria);

        contaDoCarlos.depositar(25000);
        contaDoCarlos.consultarSaldo();
        contaDoCarlos.transferir(5000, contaDaMaria);
        contaDaMaria.consultarSaldo();
        contaDaMaria.getBanco();
        contaDaMaria.getAgencia();



    }
}