package com.controledegastos.controlador;

import com.controledegastos.entidade.Categoria;
import com.controledegastos.servicos.CategoriaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaControlador {

    private CategoriaServico servico;

    @Autowired
    public CategoriaControlador(CategoriaServico servico) {
        this.servico = servico;
    }

    @GetMapping
    public List<Categoria> buscarTodos(@RequestParam Long codigo,
                                       @RequestParam String nome) {
        return servico.buscarTodos(codigo, nome);
    }
}
