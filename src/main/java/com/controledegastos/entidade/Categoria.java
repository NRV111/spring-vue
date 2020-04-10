package com.controledegastos.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "Categoria", catalog = "controledegastosapi")
public class Categoria {

    @Id
    @Column(name = "codigo")
    private Long codigo;

    @NotNull // javax.validation.constraints
    @Column(name = "nome")
    @Size(min = 1, max = 50)
    private String nome;

    // == construtor ==

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    // == getter & setter ==
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // == hash & equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return nome.equals(categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
