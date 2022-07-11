package org.dio.BancoJava;

public interface ContaInterface {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta conta);
    void consultarSaldo();

    void getAgencia();

    void getBanco();
}
