package com.unicesumar.atividade02;

public class Usuario {

    private long id;

    private String nome;

    private PermissaoEnum permissao;

    public Usuario(long id, String nome, PermissaoEnum permissao) {
        this.id = id;
        this.nome = nome;
        this.permissao = permissao;
    }

    public void lerInfo(){
        System.out.println("Ler informações");
    }

    public void insertInfo(){
        System.out.println("Inserir informações");
    }

    public void alterInfo(){
        System.out.println("Alterar informações");
    }

    public void deleteInfo(){
        System.out.println("Excluir informações");
    }

    public void execute(){

        switch (permissao.getCode()){

            case 1:
                lerInfo();
                insertInfo();
                alterInfo();
                deleteInfo();
                break;
            case 2:
                insertInfo();
                alterInfo();
                lerInfo();
                break;
            case 3:
                lerInfo();
                insertInfo();
                break;
            case 4:
                lerInfo();
                break;
            default:
                System.out.println("Codigo invalido");
        }
    }
}
