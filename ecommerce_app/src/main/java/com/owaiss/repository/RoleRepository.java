package com.owaiss.repository;

import com.owaiss.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByRole(String role);
    boolean existsByRole(String role);

}
