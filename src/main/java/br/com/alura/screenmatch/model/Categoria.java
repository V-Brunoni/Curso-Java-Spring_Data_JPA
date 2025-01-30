package br.com.alura.screenmatch.model;

public enum Categoria {

    ACAO("Action"),
    ANIMACAO("Animation"),
    AVENTURA("Adventure"),
    COMEDIA("Comedy"),
    CRIME("Crime"),
    DRAMA("Drama"),
    ROMANCE("Romance");

    private String categoriaOMDB;

    Categoria(String categoriaOMDB){
        this.categoriaOMDB = categoriaOMDB;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOMDB.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
