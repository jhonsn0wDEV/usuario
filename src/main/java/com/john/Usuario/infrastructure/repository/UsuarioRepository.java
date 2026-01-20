package com.john.Usuario.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Repository
public interface UsuarioRepository extends JpaRepository<com.john.Usuario.infrastructure.entity.Usuario,Long> {

    boolean existsByEmail(String email);

    Optional<com.john.Usuario.infrastructure.entity.Usuario> findByEmail(String email);


    @Transactional
    void deleteByEmail(String email);
}
