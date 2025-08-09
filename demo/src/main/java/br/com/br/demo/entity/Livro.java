package br.com.br.demo.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Lond id;
    @NotBlank(message = "0 titulo é obrigatorio")
    private String titulo;
    @NotBlank(message = "0 autor é obrigatorio")
    private String autor;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "A categoria é obrigatoria")
    private Categoria categoria;
    private String editora;
    @DecimalMin(value = "0.99", message = "O preço deve ser no mínimo 0.99")
    private BigDecimal preco;
    @Pattern(regexp = "^970\\d{7}$|^970\\D{10}$",
            message = "ISBN fora do padrão")
    private String isbn;
    private LocalDate dataPublicacao;

    public Livro(Lond id, String titulo, String autor, Categoria categoria, BigDecimal preco, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.preco = preco;
        this.isbn = isbn;
    }

    public Livro(Lond id) {
        this.id = id;
    }



