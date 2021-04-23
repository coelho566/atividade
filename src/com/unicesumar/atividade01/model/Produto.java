package com.unicesumar.atividade01.model;

public class Produto {

    private long identificacao;

    private String nome;

    private String descricao;

    private int quantidade;

    private double valor;

    public Produto() {
    }

    public Produto(long identificacao, String nome, String descricao, int quantidade, double valor) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public long getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(long identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "identificacao=" + identificacao +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", valor= R$" + valor +
                '}';
    }
}
