package br.com.inacio.gestao_vagas.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.csrf(csfr -> csfr.disable());
    return http.build();
  }

}
