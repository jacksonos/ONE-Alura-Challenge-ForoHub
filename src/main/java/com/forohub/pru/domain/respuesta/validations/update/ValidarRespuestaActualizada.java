package com.forohub.pru.domain.respuesta.validations.update;

import com.forohub.pru.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {
    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
