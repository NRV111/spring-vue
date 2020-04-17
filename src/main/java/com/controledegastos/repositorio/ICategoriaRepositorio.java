package com.controledegastos.repositorio;

import com.controledegastos.entidade.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoriaRepositorio extends JpaRepository<Categoria, Long> {

    @Query("FROM Categoria c WHERE (c.codigo = :codigo OR :codigo = null)" +
            "AND (c.nome LIKE %:nome% OR :nome = null)")
    List<Categoria> buscarTodos(Long codigo, String nome);
}
