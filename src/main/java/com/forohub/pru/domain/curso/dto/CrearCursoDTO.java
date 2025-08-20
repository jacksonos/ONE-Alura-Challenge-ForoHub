package com.forohub.pru.domain.curso.dto;

import com.forohub.pru.domain.curso.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearCursoDTO(
        @NotBlank String name,
        @NotNull Categoria categoria) {
}
