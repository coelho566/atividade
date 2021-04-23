package com.unicesumar.atividade01;

import com.unicesumar.atividade01.buiders.NotaFiscalBuilder;
import com.unicesumar.atividade01.buiders.ProdutoBuilder;
import com.unicesumar.atividade01.model.NotaFiscal;
import com.unicesumar.atividade01.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(1);

        Produto lenovo = new ProdutoBuilder()
                .indentificacao(atomicLong.get())
                .nome("Notebook Lenovo")
                .descricao("Notebook com 8GB de RAM")
                .quantidade(1)
                .valor(3.7890D)
                .build();


        Produto tv = new ProdutoBuilder()
                .indentificacao(atomicLong.incrementAndGet())
                .nome("Tv Lg 50 polegadas")
                .descricao("Tv com tela LCD")
                .quantidade(1)
                .valor(2.550D)
                .build();

        List<Produto> produtos = new ArrayList<>();
        produtos.add(lenovo);
        produtos.add(tv);

        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .numero(1)
                .cnpjEmissor(847111157L)
                .nomeEmissor("Pedro aleixo")
                .nomeCliente("João Pedro")
                .data("05/02/2021")
                .produtos(produtos)
                .build();

        System.out.println(notaFiscal.toString());
    }
}
