package com.event.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.management.model.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

    List<Wishlist> findByEmail(String email);

    boolean existsByEmailAndName(String email, String name);
}
