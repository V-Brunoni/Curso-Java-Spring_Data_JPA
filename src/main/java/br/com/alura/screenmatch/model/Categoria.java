package br.com.alura.screenmatch.model;

public enum Categoria {

    ACAO("Action", "Ação"),
    ANIMACAO("Animation", "Animação"),
    AVENTURA("Adventure", "Aventura"),
    COMEDIA("Comedy", "Comédia"),
    CRIME("Crime", "Crime"),
    DRAMA("Drama", "Drama"),
    ROMANCE("Romance", "Romance");

    private String categoriaOMDB;

    private String categoriaPortugues;

    Categoria(String categoriaOMDB, String categoriaPortugues){
        this.categoriaOMDB = categoriaOMDB;
        this.categoriaPortugues = categoriaPortugues;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOMDB.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPortugues(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
