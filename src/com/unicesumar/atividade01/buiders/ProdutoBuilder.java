package com.unicesumar.atividade01.buiders;

import com.unicesumar.atividade01.model.Produto;

public class ProdutoBuilder {

    private long identificacao;

    private String nome;

    private String descricao;

    private int quantidade;

    private double valor;


    public ProdutoBuilder() {

    }

    public ProdutoBuilder indentificacao(long identificacao) {
        this.identificacao = identificacao;
        return this;
    }

    public ProdutoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder quantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public ProdutoBuilder valor(double valor) {
        this.valor = valor;
        return this;
    }

    public Produto build() {
        Produto produto = new Produto();
        produto.setIdentificacao(this.identificacao);
        produto.setNome(this.nome);
        produto.setDescricao(this.descricao);
        produto.setQuantidade(this.quantidade);
        produto.setValor(this.valor);

        return produto;
    }
}
