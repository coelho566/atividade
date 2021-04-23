package com.unicesumar.atividade01.model;

import java.util.List;

public class NotaFiscal {

    private int numero;

    private String data;

    private long cnpjEmissor;

    private String nomeEmissor;

    private String nomeCliente;

    private List<Produto> produtos;

    public NotaFiscal() {
    }

    public NotaFiscal(int numero, String data, long cnpjEmissor, String nomeEmissor, String nomeCliente, List<Produto> produtos) {
        this.numero = numero;
        this.data = data;
        this.cnpjEmissor = cnpjEmissor;
        this.nomeEmissor = nomeEmissor;
        this.nomeCliente = nomeCliente;
        this.produtos = produtos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getCnpjEmissor() {
        return cnpjEmissor;
    }

    public void setCnpjEmissor(long cnpjEmissor) {
        this.cnpjEmissor = cnpjEmissor;
    }

    public String getNomeEmissor() {
        return nomeEmissor;
    }

    public void setNomeEmissor(String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "numero=" + numero +
                ", data='" + data + '\'' +
                ", cnpjEmissor=" + cnpjEmissor +
                ", nomeEmissor='" + nomeEmissor + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
