package com.forohub.pru.domain.respuesta.dto;

public record ActualizarRespuestaDTO(
        String mensaje,
        Boolean solucion,
        Boolean borrado
) {
}