package com.forohub.pru.domain.topico.dto;

import com.forohub.pru.domain.topico.Estado;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}
