package com.event.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.event.management.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
