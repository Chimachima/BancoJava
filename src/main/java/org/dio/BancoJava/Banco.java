package org.dio.BancoJava;

import java.util.List;

public class Banco {

    private String nome;
    private static Integer agencia = 101;
    private List<Conta> contas;

    public Integer getAgencia() {
        return agencia;
    }

    public String getNome() {
        return nome;
    }

    public Banco(String nome){
        this.nome = nome;
        this.agencia = agencia++;

    }

    public Conta criarConta(TipoConta tipoConta, Cliente cliente){
        return new Conta(tipoConta,this, cliente);
        }

}
