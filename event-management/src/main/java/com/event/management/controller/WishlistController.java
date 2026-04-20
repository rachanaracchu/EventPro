package com.event.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.event.management.model.Wishlist;
import com.event.management.service.WishlistService;

@RestController
@RequestMapping("/api/wishlist")
@CrossOrigin(origins = "*")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @PostMapping
    public Wishlist addToWishlist(@RequestBody Wishlist wishlist) {
        return wishlistService.addToWishlist(wishlist);
    }

    @GetMapping("/{email}")
    public List<Wishlist> getWishlist(@PathVariable String email) {
        return wishlistService.getWishlist(email);
    }

    @DeleteMapping("/{id}")
    public String removeWishlist(@PathVariable Long id) {
        wishlistService.removeWishlistItem(id);
        return "Removed from wishlist";
    }
}
