package com.event.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.management.model.Wishlist;
import com.event.management.repository.WishlistRepository;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    // ================= Add to Wishlist =================
    public Wishlist addToWishlist(Wishlist wishlist) {

        boolean exists = wishlistRepository
                .existsByEmailAndName(wishlist.getEmail(), wishlist.getName());

        if (exists) {
            throw new RuntimeException("Event already added to wishlist");
        }

        return wishlistRepository.save(wishlist);
    }

    // ================= Get Wishlist By User =================
    public List<Wishlist> getWishlist(String email) {
        return wishlistRepository.findByEmail(email);
    }

    // ================= Remove Single Item =================
    public void removeWishlistItem(Long id) {
        wishlistRepository.deleteById(id);
    }
}
