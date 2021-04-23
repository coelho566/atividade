package com.unicesumar.atividade02;

public enum PermissaoEnum {

    ADMIN(1,"Administrador"),
    SUPER(2,"Supervisor"),
    ESTAGIO(3, "Estagiário"),
    PADRAO(4, "Padrão");

    private int code;

    private String descricao;

    PermissaoEnum(int code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }
}
