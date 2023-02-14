package com.example.restapi.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
	Role findByName(String name);

}
