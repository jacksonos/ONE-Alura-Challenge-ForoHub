package com.forohub.pru.domain.usuario.dto;

import com.forohub.pru.domain.usuario.Rol;

public record ActualizarUsuarioDTO(
        String password,
        Rol rol,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}
