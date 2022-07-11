package org.dio.BancoJava;

public enum TipoConta {
    CONTA_CORRENTE("Conta Corrente"),
    CONTA_PUPANCA("Conta Poupanca");

    private String descricao;

    TipoConta(String descricao){
        this.descricao = descricao;
    }


}
