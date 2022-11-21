package com.example.springsequrity.repository;

import com.example.springsequrity.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findOneByid(String id);
}
