package com.forohub.pru.domain.curso.dto;

import com.forohub.pru.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}
