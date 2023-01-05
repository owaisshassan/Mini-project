package com.owaiss.repository;



import com.owaiss.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityRepository extends JpaRepository<UserModel, Integer> {


    public Optional<UserModel> findByEmail(String email);

    public boolean existsByEmail(String email);


}
