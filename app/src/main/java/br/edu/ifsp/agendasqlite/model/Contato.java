package br.edu.ifsp.agendasqlite.model;

import java.io.Serializable;

public class Contato implements Serializable {

    private int id;
    private String nome;
    private String fone;
    private String email;
    private int favorito;
    private String foneAdicional;
    private String dtNascimento;

    public Contato() {
    }

    public Contato(String nome, String fone, String email, int favorito, String foneAdicional, String dtNascimento) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.favorito = favorito;
    }

    public boolean equals(Object obj) {
        Contato c2 = (Contato) obj;
        if (this.id == c2.getId())
            return true;
        else
            return false;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }

    public String getFoneAdicional() {
        return foneAdicional;
    }

    public void setFoneAdicional(String foneAdicional) {
        this.foneAdicional = foneAdicional;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}
