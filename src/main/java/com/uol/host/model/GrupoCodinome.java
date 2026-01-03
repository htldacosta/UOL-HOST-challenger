package com.uol.host.model;

public enum GrupoCodinome {
    VINGADORES("Vingadores", "https://google.com"),
    LIGA_DA_JUSTICA("Liga da justiça", "https://google.com");

    GrupoCodinome(String nome, String uri) {
        this.nome = nome;
        this.uri = uri;
    }

    private final String nome;

    private final String uri;

    public String getNome() {
        return nome;
    }

    public String getUri() {
        return uri;
    }

}
