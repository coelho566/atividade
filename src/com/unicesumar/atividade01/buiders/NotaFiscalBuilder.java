package com.unicesumar.atividade01.buiders;

import com.unicesumar.atividade01.model.NotaFiscal;
import com.unicesumar.atividade01.model.Produto;

import java.util.List;

public class NotaFiscalBuilder {

    private int numero;

    private String data;

    private long cnpjEmissor;

    private String nomeEmissor;

    private String nomeCliente;

    private List<Produto> produtos;

    public NotaFiscalBuilder() {

    }

    public NotaFiscalBuilder numero(int numero) {
        this.numero = numero;
        return this;
    }

    public NotaFiscalBuilder data(String data) {
        this.data = data;
        return this;
    }

    public NotaFiscalBuilder cnpjEmissor(long cnpjEmissor) {
        this.cnpjEmissor = cnpjEmissor;
        return this;
    }

    public NotaFiscalBuilder nomeEmissor(String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
        return this;
    }

    public NotaFiscalBuilder nomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        return this;
    }

    public NotaFiscalBuilder produtos(List<Produto> produtos) {
        this.produtos = produtos;
        return this;
    }

    public NotaFiscal build() {
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setNumero(this.numero);
        notaFiscal.setData(this.data);
        notaFiscal.setCnpjEmissor(this.cnpjEmissor);
        notaFiscal.setNomeEmissor(this.nomeEmissor);
        notaFiscal.setNomeCliente(this.nomeCliente);
        notaFiscal.setProdutos(this.produtos);

        return notaFiscal;
    }
}
