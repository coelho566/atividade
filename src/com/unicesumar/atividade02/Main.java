package com.unicesumar.atividade02;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong();

        Usuario joao = new Usuario(atomicLong.get(), "João", PermissaoEnum.ADMIN);
        Usuario ana = new Usuario(atomicLong.incrementAndGet(), "Ana Paula", PermissaoEnum.SUPER);
        Usuario carlos = new Usuario(atomicLong.incrementAndGet(), "Carlos", PermissaoEnum.PADRAO);
        Usuario pedro = new Usuario(atomicLong.incrementAndGet(), "Pedro", PermissaoEnum.ESTAGIO);

        joao.execute();
        ana.execute();
        carlos.execute();
        pedro.execute();

    }
}
