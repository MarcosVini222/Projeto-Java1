package br.com.br.demo.entity;

public enum Categoria {
    TERROR("Terror"),
    ROMANCE("Romance"),
    COMEDIA("Comédia"),
    FICCAO("Ficcao"),
    SUSPENSE("Suspense"),
    FANTASIA("Fantasia"),
    BIOGRAFIA("Biografia"),
    TECNOLOGIA("Tecnologia");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
