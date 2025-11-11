package com.tattoodarte.backend_tattoodarte.repository;

import com.tattoodarte.backend_tattoodarte.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

