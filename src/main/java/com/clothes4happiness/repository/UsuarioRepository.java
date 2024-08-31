package com.clothes4happiness.repository;

import com.clothes4happiness.models.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<usuario, Long>{
}
