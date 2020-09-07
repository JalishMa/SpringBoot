package com.bob.springbootdata.repository;

import com.bob.springbootdata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
