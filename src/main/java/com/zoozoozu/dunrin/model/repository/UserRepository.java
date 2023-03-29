package com.zoozoozu.dunrin.model.repository;

import com.zoozoozu.dunrin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
