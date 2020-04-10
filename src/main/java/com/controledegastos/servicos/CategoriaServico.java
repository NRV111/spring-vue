package com.controledegastos.servicos;

import com.controledegastos.entidade.Categoria;
import com.controledegastos.repositorio.ICategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServico {

    private ICategoriaRepositorio repositorio;

    @Autowired
    public CategoriaServico(ICategoriaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Categoria> buscarTodos(Long codigo, String nome) {
        return repositorio.buscarTodos(codigo, nome);
    }
}
