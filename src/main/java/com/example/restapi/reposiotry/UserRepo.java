package com.example.restapi.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
