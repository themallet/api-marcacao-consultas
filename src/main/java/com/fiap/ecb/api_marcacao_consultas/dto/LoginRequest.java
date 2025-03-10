package com.fiap.ecb.api_marcacao_consultas.dto;

import lombok.Data;
import com.fiap.ecb.api_marcacao_consultas.dto.LoginRequest;

@Data // Gera automaticamente getters, setters, toString, etc
public class LoginRequest {
    private String email;
    private String senha;
}
