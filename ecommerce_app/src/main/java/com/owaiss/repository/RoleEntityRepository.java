package com.owaiss.repository;

import com.owaiss.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleEntityRepository extends JpaRepository<Role, Integer> {


    public Optional<Role> findRoleByRole(String role);

}
